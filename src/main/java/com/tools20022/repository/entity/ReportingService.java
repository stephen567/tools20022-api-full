/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.StatementFrequencyReason1Choice;
import com.tools20022.repository.choice.StatementFrequencyReason2Choice;
import com.tools20022.repository.codeset.FrequencyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.AccountService;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reporting parameters that are included in the account contract
 * which specifies the services linked to the account..
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ReportingService" src="doc-files/ReportingService.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#StatementFrequency
 * ReportingService.StatementFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#FloorNotificationAmount
 * ReportingService.FloorNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#CeilingNotificationAmount
 * ReportingService.CeilingNotificationAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#ReportingChannel
 * ReportingService.ReportingChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ReportingService#RelatedInvestmentAccountService
 * ReportingService.RelatedInvestmentAccountService}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedReportingService
 * ContactPoint.RelatedReportingService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#ReportingService
 * InvestmentAccountService.ReportingService}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndFormModification1#StatementFrequencyAndForm
 * StatementFrequencyAndFormModification1.StatementFrequencyAndForm}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.AccountService
 * AccountService}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatementFrequencyReason1Choice
 * StatementFrequencyReason1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1
 * StatementFrequencyAndForm1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndFormModification1
 * StatementFrequencyAndFormModification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingRequest1
 * ReportingRequest1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingRequest2
 * ReportingRequest2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportingRequest3
 * ReportingRequest3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.StatementFrequencyReason2Choice
 * StatementFrequencyReason2Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReportingService"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reporting parameters that are included in the account contract which specifies the services linked to the account.."
 * </li>
 * </ul>
 */
public class ReportingService extends AccountService {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Specifies the frequency at which a statement must be created by the
	 * account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyCode
	 * FrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.StatementDetails#Frequency
	 * StatementDetails.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails#Frequency
	 * StatementAndFinancialInstrumentDetails.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#StatementFrequency
	 * InvestmentAccount17.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount17#ExtendedStatementFrequency
	 * InvestmentAccount17.ExtendedStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#StatementFrequency
	 * InvestmentAccount27.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount27#ExtendedStatementFrequency
	 * InvestmentAccount27.ExtendedStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount35#StatementFrequency
	 * InvestmentAccount35.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#StatementFrequency
	 * InvestmentAccount18.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount18#ExtendedStatementFrequency
	 * InvestmentAccount18.ExtendedStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#StatementFrequency
	 * InvestmentAccount28.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount28#ExtendedStatementFrequency
	 * InvestmentAccount28.ExtendedStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount36#StatementFrequency
	 * InvestmentAccount36.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#StatementFrequency
	 * InvestmentAccount16.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount16#ExtendedStatementFrequency
	 * InvestmentAccount16.ExtendedStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#StatementFrequency
	 * InvestmentAccount26.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount26#ExtendedStatementFrequency
	 * InvestmentAccount26.ExtendedStatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount34#StatementFrequency
	 * InvestmentAccount34.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#StatementCycle
	 * CustomerAccount1.StatementCycle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1#Frequency
	 * StatementFrequencyAndForm1.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#StatementFrequencyAndFormat
	 * CustomerAccount5.StatementFrequencyAndFormat}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#StatementFrequencyAndFormat
	 * CustomerAccountModification1.StatementFrequencyAndFormat}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#StatementFrequencyAndFormat
	 * CustomerAccount4.StatementFrequencyAndFormat}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementAttributes1#Frequency
	 * StatementAttributes1.Frequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#StatementCycle
	 * CustomerAccount2.StatementCycle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#StatementCycle
	 * CustomerAccount3.StatementCycle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount38#StatementFrequency
	 * InvestmentAccount38.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount37#StatementFrequency
	 * InvestmentAccount37.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount39#StatementFrequency
	 * InvestmentAccount39.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount46#StatementFrequency
	 * InvestmentAccount46.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount47#StatementFrequency
	 * InvestmentAccount47.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount49#StatementFrequency
	 * InvestmentAccount49.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount51#StatementFrequency
	 * InvestmentAccount51.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount50#StatementFrequency
	 * InvestmentAccount50.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount61#StatementFrequency
	 * InvestmentAccount61.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount63#StatementFrequency
	 * InvestmentAccount63.StatementFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentAccount62#StatementFrequency
	 * InvestmentAccount62.StatementFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatementFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the frequency at which a statement must be created by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute StatementFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatementDetails.Frequency, com.tools20022.repository.msg.StatementAndFinancialInstrumentDetails.Frequency,
					com.tools20022.repository.msg.InvestmentAccount17.StatementFrequency, com.tools20022.repository.msg.InvestmentAccount17.ExtendedStatementFrequency, com.tools20022.repository.msg.InvestmentAccount27.StatementFrequency,
					com.tools20022.repository.msg.InvestmentAccount27.ExtendedStatementFrequency, com.tools20022.repository.msg.InvestmentAccount35.StatementFrequency, com.tools20022.repository.msg.InvestmentAccount18.StatementFrequency,
					com.tools20022.repository.msg.InvestmentAccount18.ExtendedStatementFrequency, com.tools20022.repository.msg.InvestmentAccount28.StatementFrequency,
					com.tools20022.repository.msg.InvestmentAccount28.ExtendedStatementFrequency, com.tools20022.repository.msg.InvestmentAccount36.StatementFrequency, com.tools20022.repository.msg.InvestmentAccount16.StatementFrequency,
					com.tools20022.repository.msg.InvestmentAccount16.ExtendedStatementFrequency, com.tools20022.repository.msg.InvestmentAccount26.StatementFrequency,
					com.tools20022.repository.msg.InvestmentAccount26.ExtendedStatementFrequency, com.tools20022.repository.msg.InvestmentAccount34.StatementFrequency, com.tools20022.repository.msg.CustomerAccount1.StatementCycle,
					com.tools20022.repository.msg.StatementFrequencyAndForm1.Frequency, com.tools20022.repository.msg.CustomerAccount5.StatementFrequencyAndFormat,
					com.tools20022.repository.msg.CustomerAccountModification1.StatementFrequencyAndFormat, com.tools20022.repository.msg.CustomerAccount4.StatementFrequencyAndFormat,
					com.tools20022.repository.msg.StatementAttributes1.Frequency, com.tools20022.repository.msg.CustomerAccount2.StatementCycle, com.tools20022.repository.msg.CustomerAccount3.StatementCycle,
					com.tools20022.repository.msg.InvestmentAccount38.StatementFrequency, com.tools20022.repository.msg.InvestmentAccount37.StatementFrequency, com.tools20022.repository.msg.InvestmentAccount39.StatementFrequency,
					com.tools20022.repository.msg.InvestmentAccount46.StatementFrequency, com.tools20022.repository.msg.InvestmentAccount47.StatementFrequency, com.tools20022.repository.msg.InvestmentAccount49.StatementFrequency,
					com.tools20022.repository.msg.InvestmentAccount51.StatementFrequency, com.tools20022.repository.msg.InvestmentAccount50.StatementFrequency, com.tools20022.repository.msg.InvestmentAccount61.StatementFrequency,
					com.tools20022.repository.msg.InvestmentAccount63.StatementFrequency, com.tools20022.repository.msg.InvestmentAccount62.StatementFrequency);
			elementContext_lazy = () -> ReportingService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "StatementFrequency";
			definition = "Specifies the frequency at which a statement must be created by the account servicer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> FrequencyCode.mmObject();
		}
	};
	/**
	 * Specifies the balance amount of an account under which a notification
	 * should be sent from the account servicer to the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#FloorNotificationAmount
	 * CustomerAccount1.FloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#FloorNotificationAmount
	 * CustomerAccount5.FloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#FloorNotificationAmount
	 * CustomerAccountModification1.FloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#FloorNotificationAmount
	 * CustomerAccount4.FloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#MinimumFloorNotificationAmount
	 * CustomerAccount2.MinimumFloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#MaximumFloorNotificationAmount
	 * CustomerAccount2.MaximumFloorNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#FloorNotificationAmount
	 * CustomerAccount3.FloorNotificationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloorNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the balance amount of an account under which a notification should be sent from the account servicer to the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute FloorNotificationAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount1.FloorNotificationAmount, com.tools20022.repository.msg.CustomerAccount5.FloorNotificationAmount,
					com.tools20022.repository.msg.CustomerAccountModification1.FloorNotificationAmount, com.tools20022.repository.msg.CustomerAccount4.FloorNotificationAmount,
					com.tools20022.repository.msg.CustomerAccount2.MinimumFloorNotificationAmount, com.tools20022.repository.msg.CustomerAccount2.MaximumFloorNotificationAmount,
					com.tools20022.repository.msg.CustomerAccount3.FloorNotificationAmount);
			elementContext_lazy = () -> ReportingService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "FloorNotificationAmount";
			definition = "Specifies the balance amount of an account under which a notification should be sent from the account servicer to the account owner.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the balance amount of an account above which a notification
	 * should be sent from the account servicer to the account owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1#CeilingNotificationAmount
	 * CustomerAccount1.CeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount5#CeilingNotificationAmount
	 * CustomerAccount5.CeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#CeilingNotificationAmount
	 * CustomerAccountModification1.CeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount4#CeilingNotificationAmount
	 * CustomerAccount4.CeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#MinimumCeilingNotificationAmount
	 * CustomerAccount2.MinimumCeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount2#MaximumCeilingNotificationAmount
	 * CustomerAccount2.MaximumCeilingNotificationAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount3#CeilingNotificationAmount
	 * CustomerAccount3.CeilingNotificationAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CeilingNotificationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the balance amount of an account above which a notification should be sent from the account servicer to the account owner."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CeilingNotificationAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CustomerAccount1.CeilingNotificationAmount, com.tools20022.repository.msg.CustomerAccount5.CeilingNotificationAmount,
					com.tools20022.repository.msg.CustomerAccountModification1.CeilingNotificationAmount, com.tools20022.repository.msg.CustomerAccount4.CeilingNotificationAmount,
					com.tools20022.repository.msg.CustomerAccount2.MinimumCeilingNotificationAmount, com.tools20022.repository.msg.CustomerAccount2.MaximumCeilingNotificationAmount,
					com.tools20022.repository.msg.CustomerAccount3.CeilingNotificationAmount);
			elementContext_lazy = () -> ReportingService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CeilingNotificationAmount";
			definition = "Specifies the balance amount of an account above which a notification should be sent from the account servicer to the account owner.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Specifies the channel through which the statement must be made available
	 * to the account owner or to the information recipient.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint#RelatedReportingService
	 * ContactPoint.RelatedReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ContactPoint
	 * ContactPoint}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementFrequencyAndForm1#CommunicationMethod
	 * StatementFrequencyAndForm1.CommunicationMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the channel through which the statement must be made available to the account owner or to the information recipient."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ReportingChannel = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatementFrequencyAndForm1.CommunicationMethod);
			elementContext_lazy = () -> ReportingService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ReportingChannel";
			definition = "Specifies the channel through which the statement must be made available to the account owner or to the information recipient.";
			minOccurs = 0;
			type_lazy = () -> ContactPoint.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ContactPoint.RelatedReportingService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Investment account services which include reporting services.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#ReportingService
	 * InvestmentAccountService.ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService
	 * InvestmentAccountService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ReportingService
	 * ReportingService}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedInvestmentAccountService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Investment account services which include reporting services."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd RelatedInvestmentAccountService = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> ReportingService.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedInvestmentAccountService";
			definition = "Investment account services which include reporting services.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentAccountService.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentAccountService.ReportingService;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReportingService";
				definition = "Specifies the reporting parameters that are included in the account contract which specifies the services linked to the account..";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ContactPoint.RelatedReportingService, com.tools20022.repository.entity.InvestmentAccountService.ReportingService);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.StatementFrequencyAndFormModification1.StatementFrequencyAndForm);
				superType_lazy = () -> AccountService.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ReportingService.StatementFrequency, com.tools20022.repository.entity.ReportingService.FloorNotificationAmount,
						com.tools20022.repository.entity.ReportingService.CeilingNotificationAmount, com.tools20022.repository.entity.ReportingService.ReportingChannel,
						com.tools20022.repository.entity.ReportingService.RelatedInvestmentAccountService);
				derivationComponent_lazy = () -> Arrays.asList(StatementFrequencyReason1Choice.mmObject(), StatementFrequencyAndForm1.mmObject(), StatementFrequencyAndFormModification1.mmObject(), ReportingRequest1.mmObject(),
						ReportingRequest2.mmObject(), ReportingRequest3.mmObject(), StatementFrequencyReason2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}