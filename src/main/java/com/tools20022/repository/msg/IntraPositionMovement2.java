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
import com.tools20022.repository.choice.CorporateActionEventType3Choice;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice;
import com.tools20022.repository.choice.PriorityNumeric1Choice;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.IntraPositionTransfer;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies additional details of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmBalanceFrom
 * IntraPositionMovement2.mmBalanceFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmBalanceTo
 * IntraPositionMovement2.mmBalanceTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmFinancialInstrumentIdentification
 * IntraPositionMovement2.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmFinancialInstrumentAttributes
 * IntraPositionMovement2.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmSettlementQuantity
 * IntraPositionMovement2.mmSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmSettledQuantity
 * IntraPositionMovement2.mmSettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmPreviouslySettledQuantity
 * IntraPositionMovement2.mmPreviouslySettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmRemainingToBeSettledQuantity
 * IntraPositionMovement2.mmRemainingToBeSettledQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmIntendedSettlementDate
 * IntraPositionMovement2.mmIntendedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmEffectiveSettlementDate
 * IntraPositionMovement2.mmEffectiveSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmStatusDate
 * IntraPositionMovement2.mmStatusDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmLinkages
 * IntraPositionMovement2.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmSecuritiesSubBalanceIdentification
 * IntraPositionMovement2.mmSecuritiesSubBalanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmPriority
 * IntraPositionMovement2.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmCorporateActionEventType
 * IntraPositionMovement2.mmCorporateActionEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmMessageOriginator
 * IntraPositionMovement2.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmCreationDateTime
 * IntraPositionMovement2.mmCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmInstructionProcessingAdditionalDetails
 * IntraPositionMovement2.mmInstructionProcessingAdditionalDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2#mmSupplementaryData
 * IntraPositionMovement2.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
 * IntraPositionTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraPositionMovement2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies additional details of the transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IntraPositionMovement4
 * IntraPositionMovement4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraPositionMovement2", propOrder = {"balanceFrom", "balanceTo", "financialInstrumentIdentification", "financialInstrumentAttributes", "settlementQuantity", "settledQuantity", "previouslySettledQuantity",
		"remainingToBeSettledQuantity", "intendedSettlementDate", "effectiveSettlementDate", "statusDate", "linkages", "securitiesSubBalanceIdentification", "priority", "corporateActionEventType", "messageOriginator", "creationDateTime",
		"instructionProcessingAdditionalDetails", "supplementaryData"})
public class IntraPositionMovement2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "BalFr", required = true)
	protected SecuritiesSubBalanceTypeAndQuantityBreakdown1 balanceFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown1
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance from which the securities are moving."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93A::FROM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmBalanceFrom
	 * IntraPositionMovement4.mmBalanceFrom}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovement2, SecuritiesSubBalanceTypeAndQuantityBreakdown1> mmBalanceFrom = new MMMessageAssociationEnd<IntraPositionMovement2, SecuritiesSubBalanceTypeAndQuantityBreakdown1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "BalFr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::FROM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFrom";
			definition = "Balance from which the securities are moving.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmBalanceFrom);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesSubBalanceTypeAndQuantityBreakdown1.mmObject();
		}

		@Override
		public SecuritiesSubBalanceTypeAndQuantityBreakdown1 getValue(IntraPositionMovement2 obj) {
			return obj.getBalanceFrom();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, SecuritiesSubBalanceTypeAndQuantityBreakdown1 value) {
			obj.setBalanceFrom(value);
		}
	};
	@XmlElement(name = "BalTo", required = true)
	protected SecuritiesSubBalanceTypeAndQuantityBreakdown1 balanceTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSubBalanceTypeAndQuantityBreakdown1
	 * SecuritiesSubBalanceTypeAndQuantityBreakdown1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance to which the securities are moving."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :93A::TOBA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmBalanceTo
	 * IntraPositionMovement4.mmBalanceTo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovement2, SecuritiesSubBalanceTypeAndQuantityBreakdown1> mmBalanceTo = new MMMessageAssociationEnd<IntraPositionMovement2, SecuritiesSubBalanceTypeAndQuantityBreakdown1>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "BalTo";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::TOBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTo";
			definition = "Balance to which the securities are moving.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmBalanceTo);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecuritiesSubBalanceTypeAndQuantityBreakdown1.mmObject();
		}

		@Override
		public SecuritiesSubBalanceTypeAndQuantityBreakdown1 getValue(IntraPositionMovement2 obj) {
			return obj.getBalanceTo();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, SecuritiesSubBalanceTypeAndQuantityBreakdown1 value) {
			obj.setBalanceTo(value);
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :35B:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmFinancialInstrumentIdentification
	 * IntraPositionMovement4.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovement2, SecurityIdentification14> mmFinancialInstrumentIdentification = new MMMessageAttribute<IntraPositionMovement2, SecurityIdentification14>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmFinancialInstrumentIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public SecurityIdentification14 getValue(IntraPositionMovement2 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, SecurityIdentification14 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes36 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes36
	 * FinancialInstrumentAttributes36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Elements characterising a financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmFinancialInstrumentAttributes
	 * IntraPositionMovement4.mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovement2, Optional<FinancialInstrumentAttributes36>> mmFinancialInstrumentAttributes = new MMMessageAssociationEnd<IntraPositionMovement2, Optional<FinancialInstrumentAttributes36>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmFinancialInstrumentAttributes);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes36.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes36> getValue(IntraPositionMovement2 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, Optional<FinancialInstrumentAttributes36> value) {
			obj.setFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmQty", required = true)
	protected FinancialInstrumentQuantity1Choice settlementQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities to be settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmSettlementQuantity
	 * IntraPositionMovement4.mmSettlementQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovement2, FinancialInstrumentQuantity1Choice> mmSettlementQuantity = new MMMessageAttribute<IntraPositionMovement2, FinancialInstrumentQuantity1Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "SttlmQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementQuantity";
			definition = "Total quantity of securities to be settled.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmSettlementQuantity);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity1Choice getValue(IntraPositionMovement2 obj) {
			return obj.getSettlementQuantity();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, FinancialInstrumentQuantity1Choice value) {
			obj.setSettlementQuantity(value);
		}
	};
	@XmlElement(name = "SttldQty")
	protected FinancialInstrumentQuantity1Choice settledQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument effectively settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmSettledQuantity
	 * IntraPositionMovement4.mmSettledQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovement2, Optional<FinancialInstrumentQuantity1Choice>> mmSettledQuantity = new MMMessageAssociationEnd<IntraPositionMovement2, Optional<FinancialInstrumentQuantity1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "SttldQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledQuantity";
			definition = "Quantity of financial instrument effectively settled.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmSettledQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1Choice> getValue(IntraPositionMovement2 obj) {
			return obj.getSettledQuantity();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, Optional<FinancialInstrumentQuantity1Choice> value) {
			obj.setSettledQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "PrevslySttldQty")
	protected FinancialInstrumentQuantity1Choice previouslySettledQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrevslySttldQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslySettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument previously settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmPreviouslySettledQuantity
	 * IntraPositionMovement4.mmPreviouslySettledQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovement2, Optional<FinancialInstrumentQuantity1Choice>> mmPreviouslySettledQuantity = new MMMessageAssociationEnd<IntraPositionMovement2, Optional<FinancialInstrumentQuantity1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "PrevslySttldQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslySettledQuantity";
			definition = "Quantity of financial instrument previously settled.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmPreviouslySettledQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1Choice> getValue(IntraPositionMovement2 obj) {
			return obj.getPreviouslySettledQuantity();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, Optional<FinancialInstrumentQuantity1Choice> value) {
			obj.setPreviouslySettledQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "RmngToBeSttldQty")
	protected FinancialInstrumentQuantity1Choice remainingToBeSettledQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity1Choice
	 * FinancialInstrumentQuantity1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngToBeSttldQty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingToBeSettledQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of financial instrument remaining to be settled."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmRemainingToBeSettledQuantity
	 * IntraPositionMovement4.mmRemainingToBeSettledQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovement2, Optional<FinancialInstrumentQuantity1Choice>> mmRemainingToBeSettledQuantity = new MMMessageAttribute<IntraPositionMovement2, Optional<FinancialInstrumentQuantity1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "RmngToBeSttldQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingToBeSettledQuantity";
			definition = "Quantity of financial instrument remaining to be settled.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmRemainingToBeSettledQuantity);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantity1Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity1Choice> getValue(IntraPositionMovement2 obj) {
			return obj.getRemainingToBeSettledQuantity();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, Optional<FinancialInstrumentQuantity1Choice> value) {
			obj.setRemainingToBeSettledQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "IntnddSttlmDt", required = true)
	protected DateAndDateTimeChoice intendedSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntnddSttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntendedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are intended to be moved."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmIntendedSettlementDate
	 * IntraPositionMovement4.mmIntendedSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovement2, DateAndDateTimeChoice> mmIntendedSettlementDate = new MMMessageAttribute<IntraPositionMovement2, DateAndDateTimeChoice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "IntnddSttlmDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntendedSettlementDate";
			definition = "Date and time at which the securities are intended to be moved.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmIntendedSettlementDate);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(IntraPositionMovement2 obj) {
			return obj.getIntendedSettlementDate();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, DateAndDateTimeChoice value) {
			obj.setIntendedSettlementDate(value);
		}
	};
	@XmlElement(name = "FctvSttlmDt")
	protected DateAndDateTimeChoice effectiveSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvSttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the securities are moved."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::ESET</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmEffectiveSettlementDate
	 * IntraPositionMovement4.mmEffectiveSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovement2, Optional<DateAndDateTimeChoice>> mmEffectiveSettlementDate = new MMMessageAttribute<IntraPositionMovement2, Optional<DateAndDateTimeChoice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "FctvSttlmDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::ESET"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDate";
			definition = "Date and time at which the securities are moved.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmEffectiveSettlementDate);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public Optional<DateAndDateTimeChoice> getValue(IntraPositionMovement2 obj) {
			return obj.getEffectiveSettlementDate();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, Optional<DateAndDateTimeChoice> value) {
			obj.setEffectiveSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "StsDt")
	protected ISODateTime statusDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StsDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the status was assigned."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmStatusDate
	 * IntraPositionMovement4.mmStatusDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovement2, Optional<ISODateTime>> mmStatusDate = new MMMessageAttribute<IntraPositionMovement2, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "StsDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusDate";
			definition = "Date and time at which the status was assigned.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmStatusDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(IntraPositionMovement2 obj) {
			return obj.getStatusDate();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, Optional<ISODateTime> value) {
			obj.setStatusDate(value.orElse(null));
		}
	};
	@XmlElement(name = "Lnkgs")
	protected List<Linkages26> linkages;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Linkages26
	 * Linkages26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lnkgs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Linkages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Link to another transaction that must be processed after, before or at the same time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmLinkages
	 * IntraPositionMovement4.mmLinkages}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovement2, List<Linkages26>> mmLinkages = new MMMessageAttribute<IntraPositionMovement2, List<Linkages26>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "Lnkgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkages";
			definition = "Link to another transaction that must be processed after, before or at the same time.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmLinkages);
			minOccurs = 0;
			complexType_lazy = () -> Linkages26.mmObject();
		}

		@Override
		public List<Linkages26> getValue(IntraPositionMovement2 obj) {
			return obj.getLinkages();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, List<Linkages26> value) {
			obj.setLinkages(value);
		}
	};
	@XmlElement(name = "SctiesSubBalId")
	protected GenericIdentification37 securitiesSubBalanceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification37
	 * GenericIdentification37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSubBalId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSubBalanceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number identifying a lot constituting the sub-balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmSecuritiesSubBalanceIdentification
	 * IntraPositionMovement4.mmSecuritiesSubBalanceIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovement2, Optional<GenericIdentification37>> mmSecuritiesSubBalanceIdentification = new MMMessageAssociationEnd<IntraPositionMovement2, Optional<GenericIdentification37>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "SctiesSubBalId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSubBalanceIdentification";
			definition = "Number identifying a lot constituting the sub-balance.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmSecuritiesSubBalanceIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification37.mmObject();
		}

		@Override
		public Optional<GenericIdentification37> getValue(IntraPositionMovement2 obj) {
			return obj.getSecuritiesSubBalanceIdentification();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, Optional<GenericIdentification37> value) {
			obj.setSecuritiesSubBalanceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "Prty")
	protected PriorityNumeric1Choice priority;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric1Choice
	 * PriorityNumeric1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is to be executed with a high priority."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::PRIR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmPriority
	 * IntraPositionMovement4.mmPriority}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovement2, Optional<PriorityNumeric1Choice>> mmPriority = new MMMessageAttribute<IntraPositionMovement2, Optional<PriorityNumeric1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::PRIR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmPriority);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriorityNumeric1Choice.mmObject();
		}

		@Override
		public Optional<PriorityNumeric1Choice> getValue(IntraPositionMovement2 obj) {
			return obj.getPriority();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, Optional<PriorityNumeric1Choice> value) {
			obj.setPriority(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnEvtTp")
	protected CorporateActionEventType3Choice corporateActionEventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventType3Choice
	 * CorporateActionEventType3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of corporate event."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmCorporateActionEventType
	 * IntraPositionMovement4.mmCorporateActionEventType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovement2, Optional<CorporateActionEventType3Choice>> mmCorporateActionEventType = new MMMessageAttribute<IntraPositionMovement2, Optional<CorporateActionEventType3Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventType";
			definition = "Specifies the type of corporate event.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmCorporateActionEventType);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CorporateActionEventType3Choice.mmObject();
		}

		@Override
		public Optional<CorporateActionEventType3Choice> getValue(IntraPositionMovement2 obj) {
			return obj.getCorporateActionEventType();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, Optional<CorporateActionEventType3Choice> value) {
			obj.setCorporateActionEventType(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgOrgtr")
	protected SystemPartyIdentification5 messageOriginator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification5
	 * SystemPartyIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgOrgtr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that originated the message, if other than the sender."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmMessageOriginator
	 * IntraPositionMovement4.mmMessageOriginator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovement2, Optional<SystemPartyIdentification5>> mmMessageOriginator = new MMMessageAssociationEnd<IntraPositionMovement2, Optional<SystemPartyIdentification5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmMessageOriginator);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification5.mmObject();
		}

		@Override
		public Optional<SystemPartyIdentification5> getValue(IntraPositionMovement2 obj) {
			return obj.getMessageOriginator();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, Optional<SystemPartyIdentification5> value) {
			obj.setMessageOriginator(value.orElse(null));
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the creation date/time of the intra-position movement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::TRAD</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmCreationDateTime
	 * IntraPositionMovement4.mmCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovement2, ISODateTime> mmCreationDateTime = new MMMessageAttribute<IntraPositionMovement2, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Specifies the creation date/time of the intra-position movement.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmCreationDateTime);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(IntraPositionMovement2 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};
	@XmlElement(name = "InstrPrcgAddtlDtls")
	protected Max350Text instructionProcessingAdditionalDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrPrcgAddtlDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionProcessingAdditionalDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional settlement processing information which can not be included within the structured fields of the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :70E::SPRO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmInstructionProcessingAdditionalDetails
	 * IntraPositionMovement4.mmInstructionProcessingAdditionalDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraPositionMovement2, Optional<Max350Text>> mmInstructionProcessingAdditionalDetails = new MMMessageAttribute<IntraPositionMovement2, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "InstrPrcgAddtlDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::SPRO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessingAdditionalDetails";
			definition = "Provides additional settlement processing information which can not be included within the structured fields of the message.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmInstructionProcessingAdditionalDetails);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(IntraPositionMovement2 obj) {
			return obj.getInstructionProcessingAdditionalDetails();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, Optional<Max350Text> value) {
			obj.setInstructionProcessingAdditionalDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement2
	 * IntraPositionMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement4#mmSupplementaryData
	 * IntraPositionMovement4.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraPositionMovement2, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<IntraPositionMovement2, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraPositionMovement2.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmSupplementaryData);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(IntraPositionMovement2 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(IntraPositionMovement2 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraPositionMovement2.mmBalanceFrom, com.tools20022.repository.msg.IntraPositionMovement2.mmBalanceTo,
						com.tools20022.repository.msg.IntraPositionMovement2.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.IntraPositionMovement2.mmFinancialInstrumentAttributes,
						com.tools20022.repository.msg.IntraPositionMovement2.mmSettlementQuantity, com.tools20022.repository.msg.IntraPositionMovement2.mmSettledQuantity,
						com.tools20022.repository.msg.IntraPositionMovement2.mmPreviouslySettledQuantity, com.tools20022.repository.msg.IntraPositionMovement2.mmRemainingToBeSettledQuantity,
						com.tools20022.repository.msg.IntraPositionMovement2.mmIntendedSettlementDate, com.tools20022.repository.msg.IntraPositionMovement2.mmEffectiveSettlementDate,
						com.tools20022.repository.msg.IntraPositionMovement2.mmStatusDate, com.tools20022.repository.msg.IntraPositionMovement2.mmLinkages,
						com.tools20022.repository.msg.IntraPositionMovement2.mmSecuritiesSubBalanceIdentification, com.tools20022.repository.msg.IntraPositionMovement2.mmPriority,
						com.tools20022.repository.msg.IntraPositionMovement2.mmCorporateActionEventType, com.tools20022.repository.msg.IntraPositionMovement2.mmMessageOriginator,
						com.tools20022.repository.msg.IntraPositionMovement2.mmCreationDateTime, com.tools20022.repository.msg.IntraPositionMovement2.mmInstructionProcessingAdditionalDetails,
						com.tools20022.repository.msg.IntraPositionMovement2.mmSupplementaryData);
				trace_lazy = () -> IntraPositionTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraPositionMovement2";
				definition = "Identifies additional details of the transaction.";
				nextVersions_lazy = () -> Arrays.asList(IntraPositionMovement4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public SecuritiesSubBalanceTypeAndQuantityBreakdown1 getBalanceFrom() {
		return balanceFrom;
	}

	public IntraPositionMovement2 setBalanceFrom(SecuritiesSubBalanceTypeAndQuantityBreakdown1 balanceFrom) {
		this.balanceFrom = Objects.requireNonNull(balanceFrom);
		return this;
	}

	public SecuritiesSubBalanceTypeAndQuantityBreakdown1 getBalanceTo() {
		return balanceTo;
	}

	public IntraPositionMovement2 setBalanceTo(SecuritiesSubBalanceTypeAndQuantityBreakdown1 balanceTo) {
		this.balanceTo = Objects.requireNonNull(balanceTo);
		return this;
	}

	public SecurityIdentification14 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public IntraPositionMovement2 setFinancialInstrumentIdentification(SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrumentAttributes36> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public IntraPositionMovement2 setFinancialInstrumentAttributes(FinancialInstrumentAttributes36 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public FinancialInstrumentQuantity1Choice getSettlementQuantity() {
		return settlementQuantity;
	}

	public IntraPositionMovement2 setSettlementQuantity(FinancialInstrumentQuantity1Choice settlementQuantity) {
		this.settlementQuantity = Objects.requireNonNull(settlementQuantity);
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getSettledQuantity() {
		return settledQuantity == null ? Optional.empty() : Optional.of(settledQuantity);
	}

	public IntraPositionMovement2 setSettledQuantity(FinancialInstrumentQuantity1Choice settledQuantity) {
		this.settledQuantity = settledQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getPreviouslySettledQuantity() {
		return previouslySettledQuantity == null ? Optional.empty() : Optional.of(previouslySettledQuantity);
	}

	public IntraPositionMovement2 setPreviouslySettledQuantity(FinancialInstrumentQuantity1Choice previouslySettledQuantity) {
		this.previouslySettledQuantity = previouslySettledQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity1Choice> getRemainingToBeSettledQuantity() {
		return remainingToBeSettledQuantity == null ? Optional.empty() : Optional.of(remainingToBeSettledQuantity);
	}

	public IntraPositionMovement2 setRemainingToBeSettledQuantity(FinancialInstrumentQuantity1Choice remainingToBeSettledQuantity) {
		this.remainingToBeSettledQuantity = remainingToBeSettledQuantity;
		return this;
	}

	public DateAndDateTimeChoice getIntendedSettlementDate() {
		return intendedSettlementDate;
	}

	public IntraPositionMovement2 setIntendedSettlementDate(DateAndDateTimeChoice intendedSettlementDate) {
		this.intendedSettlementDate = Objects.requireNonNull(intendedSettlementDate);
		return this;
	}

	public Optional<DateAndDateTimeChoice> getEffectiveSettlementDate() {
		return effectiveSettlementDate == null ? Optional.empty() : Optional.of(effectiveSettlementDate);
	}

	public IntraPositionMovement2 setEffectiveSettlementDate(DateAndDateTimeChoice effectiveSettlementDate) {
		this.effectiveSettlementDate = effectiveSettlementDate;
		return this;
	}

	public Optional<ISODateTime> getStatusDate() {
		return statusDate == null ? Optional.empty() : Optional.of(statusDate);
	}

	public IntraPositionMovement2 setStatusDate(ISODateTime statusDate) {
		this.statusDate = statusDate;
		return this;
	}

	public List<Linkages26> getLinkages() {
		return linkages == null ? linkages = new ArrayList<>() : linkages;
	}

	public IntraPositionMovement2 setLinkages(List<Linkages26> linkages) {
		this.linkages = Objects.requireNonNull(linkages);
		return this;
	}

	public Optional<GenericIdentification37> getSecuritiesSubBalanceIdentification() {
		return securitiesSubBalanceIdentification == null ? Optional.empty() : Optional.of(securitiesSubBalanceIdentification);
	}

	public IntraPositionMovement2 setSecuritiesSubBalanceIdentification(GenericIdentification37 securitiesSubBalanceIdentification) {
		this.securitiesSubBalanceIdentification = securitiesSubBalanceIdentification;
		return this;
	}

	public Optional<PriorityNumeric1Choice> getPriority() {
		return priority == null ? Optional.empty() : Optional.of(priority);
	}

	public IntraPositionMovement2 setPriority(PriorityNumeric1Choice priority) {
		this.priority = priority;
		return this;
	}

	public Optional<CorporateActionEventType3Choice> getCorporateActionEventType() {
		return corporateActionEventType == null ? Optional.empty() : Optional.of(corporateActionEventType);
	}

	public IntraPositionMovement2 setCorporateActionEventType(CorporateActionEventType3Choice corporateActionEventType) {
		this.corporateActionEventType = corporateActionEventType;
		return this;
	}

	public Optional<SystemPartyIdentification5> getMessageOriginator() {
		return messageOriginator == null ? Optional.empty() : Optional.of(messageOriginator);
	}

	public IntraPositionMovement2 setMessageOriginator(SystemPartyIdentification5 messageOriginator) {
		this.messageOriginator = messageOriginator;
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public IntraPositionMovement2 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Optional<Max350Text> getInstructionProcessingAdditionalDetails() {
		return instructionProcessingAdditionalDetails == null ? Optional.empty() : Optional.of(instructionProcessingAdditionalDetails);
	}

	public IntraPositionMovement2 setInstructionProcessingAdditionalDetails(Max350Text instructionProcessingAdditionalDetails) {
		this.instructionProcessingAdditionalDetails = instructionProcessingAdditionalDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public IntraPositionMovement2 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}