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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.LegalFramework2Choice;
import com.tools20022.repository.choice.RateType8Choice;
import com.tools20022.repository.choice.TerminationDate3Choice;
import com.tools20022.repository.datatype.Exact3NumericText;
import com.tools20022.repository.datatype.RestrictedFINXMax140Text;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.entity.InterestCalculation;
import com.tools20022.repository.entity.SecuritiesFinancing;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the closing of the securities financing transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmSecuritiesFinancingTradeIdentification
 * SecuritiesFinancingTransactionDetails9.
 * mmSecuritiesFinancingTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmClosingLegIdentification
 * SecuritiesFinancingTransactionDetails9.mmClosingLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmTerminationDate
 * SecuritiesFinancingTransactionDetails9.mmTerminationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmRateType
 * SecuritiesFinancingTransactionDetails9.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmLegalFramework
 * SecuritiesFinancingTransactionDetails9.mmLegalFramework}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmMaturityDateModification
 * SecuritiesFinancingTransactionDetails9.mmMaturityDateModification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmInterestPayment
 * SecuritiesFinancingTransactionDetails9.mmInterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmVariableRateSupport
 * SecuritiesFinancingTransactionDetails9.mmVariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmRepurchaseRate
 * SecuritiesFinancingTransactionDetails9.mmRepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmTransactionCallDelay
 * SecuritiesFinancingTransactionDetails9.mmTransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmAccruedInterestAmount
 * SecuritiesFinancingTransactionDetails9.mmAccruedInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmTerminationTransactionAmount
 * SecuritiesFinancingTransactionDetails9.mmTerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9#mmSecondLegNarrative
 * SecuritiesFinancingTransactionDetails9.mmSecondLegNarrative}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
 * SecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#forSecuritiesFinancingTransactionDetails9
 * ConstraintCoexistenceIdentificationRule.
 * forSecuritiesFinancingTransactionDetails9}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forSecuritiesFinancingTransactionDetails9
 * ConstraintCoexistenceAmountRule.forSecuritiesFinancingTransactionDetails9}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingTransactionDetails9"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Details of the closing of the securities financing transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesFinancingTransactionDetails9", propOrder = {"securitiesFinancingTradeIdentification", "closingLegIdentification", "terminationDate", "rateType", "legalFramework", "maturityDateModification", "interestPayment",
		"variableRateSupport", "repurchaseRate", "transactionCallDelay", "accruedInterestAmount", "terminationTransactionAmount", "secondLegNarrative"})
public class SecuritiesFinancingTransactionDetails9 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesFincgTradId")
	protected RestrictedFINXMax16Text securitiesFinancingTradeIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9
	 * SecuritiesFinancingTransactionDetails9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgTradId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::REPO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingTradeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the underlying securities financing trade as assigned by the instructing party. The identification is common to all collateral pieces (one or many)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecuritiesFinancingTradeIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgTradId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::REPO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingTradeIdentification";
			definition = "Unambiguous identification of the underlying securities financing trade as assigned by the instructing party. The identification is common to all collateral pieces (one or many).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	@XmlElement(name = "ClsgLegId")
	protected RestrictedFINXMax16Text closingLegIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9
	 * SecuritiesFinancingTransactionDetails9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgLegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::SECO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingLegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the second leg of the transaction as known by the account owner (or the instructing party acting on its behalf)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClosingLegIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmObject();
			isDerived = false;
			xmlTag = "ClsgLegId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::SECO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingLegIdentification";
			definition = "Unambiguous identification of the second leg of the transaction as known by the account owner (or the instructing party acting on its behalf).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	@XmlElement(name = "TermntnDt")
	protected TerminationDate3Choice terminationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.TerminationDate3Choice
	 * TerminationDate3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationDateTime
	 * SecuritiesFinancing.mmTerminationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9
	 * SecuritiesFinancingTransactionDetails9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::TERM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Closing date/time or maturity date/time of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerminationDate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmObject();
			isDerived = false;
			xmlTag = "TermntnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TERM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationDate";
			definition = "Closing date/time or maturity date/time of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TerminationDate3Choice.mmObject();
		}
	};
	@XmlElement(name = "RateTp")
	protected RateType8Choice rateType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.RateType8Choice
	 * RateType8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmRateType
	 * InterestCalculation.mmRateType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9
	 * SecuritiesFinancingTransactionDetails9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RateTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::RERT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the rate is fixed or variable."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRateType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmRateType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmObject();
			isDerived = false;
			xmlTag = "RateTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::RERT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateType";
			definition = "Specifies whether the rate is fixed or variable.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RateType8Choice.mmObject();
		}
	};
	@XmlElement(name = "LglFrmwk")
	protected LegalFramework2Choice legalFramework;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LegalFramework2Choice
	 * LegalFramework2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmLegalFramework
	 * SecuritiesTrade.mmLegalFramework}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9
	 * SecuritiesFinancingTransactionDetails9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglFrmwk"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LEGA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalFramework"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Legal framework of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLegalFramework = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmLegalFramework;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmObject();
			isDerived = false;
			xmlTag = "LglFrmwk";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LEGA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalFramework";
			definition = "Legal framework of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LegalFramework2Choice.mmObject();
		}
	};
	@XmlElement(name = "MtrtyDtMod")
	protected YesNoIndicator maturityDateModification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmMaturityDateModification
	 * SecuritiesFinancing.mmMaturityDateModification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9
	 * SecuritiesFinancingTransactionDetails9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtrtyDtMod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LEGA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDateModification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the maturity date of the securities financing transaction may be modified."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaturityDateModification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmMaturityDateModification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmObject();
			isDerived = false;
			xmlTag = "MtrtyDtMod";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LEGA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDateModification";
			definition = "Specifies whether the maturity date of the securities financing transaction may be modified.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "IntrstPmt")
	protected YesNoIndicator interestPayment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmInterestPayment
	 * SecuritiesFinancing.mmInterestPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9
	 * SecuritiesFinancingTransactionDetails9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LEGA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the interest is to be paid to the collateral taker. If set to no, the interest is paid to the collateral giver."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestPayment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmInterestPayment;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmObject();
			isDerived = false;
			xmlTag = "IntrstPmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LEGA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPayment";
			definition = "Specifies whether the interest is to be paid to the collateral taker. If set to no, the interest is paid to the collateral giver.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "VarblRateSpprt")
	protected RateName2 variableRateSupport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RateName2 RateName2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmVariableRateSupport
	 * SecuritiesFinancing.mmVariableRateSupport}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9
	 * SecuritiesFinancingTransactionDetails9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VarblRateSpprt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::VASU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Index or support rate used together with the spread to calculate the\nrepurchase rate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVariableRateSupport = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmVariableRateSupport;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmObject();
			isDerived = false;
			xmlTag = "VarblRateSpprt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::VASU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			definition = "Index or support rate used together with the spread to calculate the\nrepurchase rate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RateName2.mmObject();
		}
	};
	@XmlElement(name = "RpRate")
	protected Rate2 repurchaseRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Rate2 Rate2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmRepurchaseRate
	 * SecuritiesFinancing.mmRepurchaseRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9
	 * SecuritiesFinancingTransactionDetails9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RpRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92a::REPO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate to be used to recalculate the repurchase amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRepurchaseRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmRepurchaseRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmObject();
			isDerived = false;
			xmlTag = "RpRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92a::REPO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			definition = "Rate to be used to recalculate the repurchase amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Rate2.mmObject();
		}
	};
	@XmlElement(name = "TxCallDely")
	protected Exact3NumericText transactionCallDelay;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Exact3NumericText
	 * Exact3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTransactionCallDelay
	 * SecuritiesFinancing.mmTransactionCallDelay}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9
	 * SecuritiesFinancingTransactionDetails9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxCallDely"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :99B::CADE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCallDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of days' notice a counterparty needs for terminating the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionCallDelay = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTransactionCallDelay;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmObject();
			isDerived = false;
			xmlTag = "TxCallDely";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99B::CADE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			definition = "Minimum number of days' notice a counterparty needs for terminating the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Exact3NumericText.mmObject();
		}
	};
	@XmlElement(name = "AcrdIntrstAmt")
	protected AmountAndDirection13 accruedInterestAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection13
	 * AmountAndDirection13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9
	 * SecuritiesFinancingTransactionDetails9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::ACRU</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest amount that has accrued in between coupon payment periods."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccruedInterestAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::ACRU"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Interest amount that has accrued in between coupon payment periods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection13.mmObject();
		}
	};
	@XmlElement(name = "TermntnTxAmt")
	protected AmountAndDirection13 terminationTransactionAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection13
	 * AmountAndDirection13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmTerminationTransactionAmount
	 * SecuritiesFinancing.mmTerminationTransactionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9
	 * SecuritiesFinancingTransactionDetails9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnTxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::TRTE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be settled to terminate the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTerminationTransactionAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmTerminationTransactionAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmObject();
			isDerived = false;
			xmlTag = "TermntnTxAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::TRTE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Total amount of money to be settled to terminate the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection13.mmObject();
		}
	};
	@XmlElement(name = "ScndLegNrrtv")
	protected RestrictedFINXMax140Text secondLegNarrative;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax140Text
	 * RestrictedFINXMax140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9
	 * SecuritiesFinancingTransactionDetails9}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndLegNrrtv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70C::SECO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondLegNarrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information about the second leg in narrative form."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSecondLegNarrative = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmObject();
			isDerived = false;
			xmlTag = "ScndLegNrrtv";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70C::SECO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondLegNarrative";
			definition = "Provides additional information about the second leg in narrative form.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmSecuritiesFinancingTradeIdentification,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmClosingLegIdentification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmTerminationDate,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmRateType, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmLegalFramework,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmMaturityDateModification, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmInterestPayment,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmVariableRateSupport, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmRepurchaseRate,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmTransactionCallDelay, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmAccruedInterestAmount,
						com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmTerminationTransactionAmount, com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails9.mmSecondLegNarrative);
				trace_lazy = () -> SecuritiesFinancing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.forSecuritiesFinancingTransactionDetails9,
						com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forSecuritiesFinancingTransactionDetails9);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SecuritiesFinancingTransactionDetails9";
				definition = "Details of the closing of the securities financing transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RestrictedFINXMax16Text> getSecuritiesFinancingTradeIdentification() {
		return securitiesFinancingTradeIdentification == null ? Optional.empty() : Optional.of(securitiesFinancingTradeIdentification);
	}

	public SecuritiesFinancingTransactionDetails9 setSecuritiesFinancingTradeIdentification(RestrictedFINXMax16Text securitiesFinancingTradeIdentification) {
		this.securitiesFinancingTradeIdentification = securitiesFinancingTradeIdentification;
		return this;
	}

	public Optional<RestrictedFINXMax16Text> getClosingLegIdentification() {
		return closingLegIdentification == null ? Optional.empty() : Optional.of(closingLegIdentification);
	}

	public SecuritiesFinancingTransactionDetails9 setClosingLegIdentification(RestrictedFINXMax16Text closingLegIdentification) {
		this.closingLegIdentification = closingLegIdentification;
		return this;
	}

	public Optional<TerminationDate3Choice> getTerminationDate() {
		return terminationDate == null ? Optional.empty() : Optional.of(terminationDate);
	}

	public SecuritiesFinancingTransactionDetails9 setTerminationDate(TerminationDate3Choice terminationDate) {
		this.terminationDate = terminationDate;
		return this;
	}

	public Optional<RateType8Choice> getRateType() {
		return rateType == null ? Optional.empty() : Optional.of(rateType);
	}

	public SecuritiesFinancingTransactionDetails9 setRateType(RateType8Choice rateType) {
		this.rateType = rateType;
		return this;
	}

	public Optional<LegalFramework2Choice> getLegalFramework() {
		return legalFramework == null ? Optional.empty() : Optional.of(legalFramework);
	}

	public SecuritiesFinancingTransactionDetails9 setLegalFramework(LegalFramework2Choice legalFramework) {
		this.legalFramework = legalFramework;
		return this;
	}

	public Optional<YesNoIndicator> getMaturityDateModification() {
		return maturityDateModification == null ? Optional.empty() : Optional.of(maturityDateModification);
	}

	public SecuritiesFinancingTransactionDetails9 setMaturityDateModification(YesNoIndicator maturityDateModification) {
		this.maturityDateModification = maturityDateModification;
		return this;
	}

	public Optional<YesNoIndicator> getInterestPayment() {
		return interestPayment == null ? Optional.empty() : Optional.of(interestPayment);
	}

	public SecuritiesFinancingTransactionDetails9 setInterestPayment(YesNoIndicator interestPayment) {
		this.interestPayment = interestPayment;
		return this;
	}

	public Optional<RateName2> getVariableRateSupport() {
		return variableRateSupport == null ? Optional.empty() : Optional.of(variableRateSupport);
	}

	public SecuritiesFinancingTransactionDetails9 setVariableRateSupport(com.tools20022.repository.msg.RateName2 variableRateSupport) {
		this.variableRateSupport = variableRateSupport;
		return this;
	}

	public Optional<Rate2> getRepurchaseRate() {
		return repurchaseRate == null ? Optional.empty() : Optional.of(repurchaseRate);
	}

	public SecuritiesFinancingTransactionDetails9 setRepurchaseRate(com.tools20022.repository.msg.Rate2 repurchaseRate) {
		this.repurchaseRate = repurchaseRate;
		return this;
	}

	public Optional<Exact3NumericText> getTransactionCallDelay() {
		return transactionCallDelay == null ? Optional.empty() : Optional.of(transactionCallDelay);
	}

	public SecuritiesFinancingTransactionDetails9 setTransactionCallDelay(Exact3NumericText transactionCallDelay) {
		this.transactionCallDelay = transactionCallDelay;
		return this;
	}

	public Optional<AmountAndDirection13> getAccruedInterestAmount() {
		return accruedInterestAmount == null ? Optional.empty() : Optional.of(accruedInterestAmount);
	}

	public SecuritiesFinancingTransactionDetails9 setAccruedInterestAmount(com.tools20022.repository.msg.AmountAndDirection13 accruedInterestAmount) {
		this.accruedInterestAmount = accruedInterestAmount;
		return this;
	}

	public Optional<AmountAndDirection13> getTerminationTransactionAmount() {
		return terminationTransactionAmount == null ? Optional.empty() : Optional.of(terminationTransactionAmount);
	}

	public SecuritiesFinancingTransactionDetails9 setTerminationTransactionAmount(com.tools20022.repository.msg.AmountAndDirection13 terminationTransactionAmount) {
		this.terminationTransactionAmount = terminationTransactionAmount;
		return this;
	}

	public Optional<RestrictedFINXMax140Text> getSecondLegNarrative() {
		return secondLegNarrative == null ? Optional.empty() : Optional.of(secondLegNarrative);
	}

	public SecuritiesFinancingTransactionDetails9 setSecondLegNarrative(RestrictedFINXMax140Text secondLegNarrative) {
		this.secondLegNarrative = secondLegNarrative;
		return this;
	}
}