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
import com.tools20022.repository.choice.Amount2Choice;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.BookEntry;
import com.tools20022.repository.entity.CashBalance;
import com.tools20022.repository.entity.CashEntry;
import com.tools20022.repository.entity.CashSettlement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1;
import com.tools20022.repository.msg.GenericIdentification37;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the intra-balance movement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance2#mmSettledAmount
 * IntraBalance2.mmSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalance2#mmPreviouslySettledAmount
 * IntraBalance2.mmPreviouslySettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalance2#mmRemainingSettlementAmount
 * IntraBalance2.mmRemainingSettlementAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance2#mmSettlementDate
 * IntraBalance2.mmSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance2#mmBalanceFrom
 * IntraBalance2.mmBalanceFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance2#mmBalanceTo
 * IntraBalance2.mmBalanceTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalance2#mmCashSubBalanceIdentification
 * IntraBalance2.mmCashSubBalanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalance2#mmInstructionProcessingAdditionalDetails
 * IntraBalance2.mmInstructionProcessingAdditionalDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.BookEntry BookEntry}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IntraBalance2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the intra-balance movement."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance4 IntraBalance4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IntraBalance2", propOrder = {"settledAmount", "previouslySettledAmount", "remainingSettlementAmount", "settlementDate", "balanceFrom", "balanceTo", "cashSubBalanceIdentification", "instructionProcessingAdditionalDetails"})
public class IntraBalance2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SttldAmt")
	protected Amount2Choice settledAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Amount2Choice
	 * Amount2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
	 * CashEntry.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2 IntraBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance4#mmSettledAmount
	 * IntraBalance4.mmSettledAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalance2, Optional<Amount2Choice>> mmSettledAmount = new MMMessageAssociationEnd<IntraBalance2, Optional<Amount2Choice>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalance2.mmObject();
			isDerived = false;
			xmlTag = "SttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledAmount";
			definition = "Amount of money effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalance4.mmSettledAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Amount2Choice.mmObject();
		}

		@Override
		public Optional<Amount2Choice> getValue(IntraBalance2 obj) {
			return obj.getSettledAmount();
		}

		@Override
		public void setValue(IntraBalance2 obj, Optional<Amount2Choice> value) {
			obj.setSettledAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "PrevslySttldAmt")
	protected Amount2Choice previouslySettledAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Amount2Choice
	 * Amount2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
	 * CashEntry.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2 IntraBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrevslySttldAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslySettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money previously settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance4#mmPreviouslySettledAmount
	 * IntraBalance4.mmPreviouslySettledAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalance2, Optional<Amount2Choice>> mmPreviouslySettledAmount = new MMMessageAssociationEnd<IntraBalance2, Optional<Amount2Choice>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalance2.mmObject();
			isDerived = false;
			xmlTag = "PrevslySttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslySettledAmount";
			definition = "Amount of money previously settled.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalance4.mmPreviouslySettledAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Amount2Choice.mmObject();
		}

		@Override
		public Optional<Amount2Choice> getValue(IntraBalance2 obj) {
			return obj.getPreviouslySettledAmount();
		}

		@Override
		public void setValue(IntraBalance2 obj, Optional<Amount2Choice> value) {
			obj.setPreviouslySettledAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "RmngSttlmAmt")
	protected Amount2Choice remainingSettlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Amount2Choice
	 * Amount2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmAmount
	 * CashEntry.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2 IntraBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmngSttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemainingSettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money remaining to be settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalance4#mmRemainingSettlementAmount
	 * IntraBalance4.mmRemainingSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalance2, Optional<Amount2Choice>> mmRemainingSettlementAmount = new MMMessageAssociationEnd<IntraBalance2, Optional<Amount2Choice>>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalance2.mmObject();
			isDerived = false;
			xmlTag = "RmngSttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemainingSettlementAmount";
			definition = "Amount of money remaining to be settled.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalance4.mmRemainingSettlementAmount);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Amount2Choice.mmObject();
		}

		@Override
		public Optional<Amount2Choice> getValue(IntraBalance2 obj) {
			return obj.getRemainingSettlementAmount();
		}

		@Override
		public void setValue(IntraBalance2 obj, Optional<Amount2Choice> value) {
			obj.setRemainingSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmDt", required = true)
	protected DateAndDateTimeChoice settlementDate;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#mmInterbankSettlementDate
	 * CashSettlement.mmInterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2 IntraBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the amount of money is moved."</li>
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalance4#mmSettlementDate
	 * IntraBalance4.mmSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalance2, DateAndDateTimeChoice> mmSettlementDate = new MMMessageAttribute<IntraBalance2, DateAndDateTimeChoice>() {
		{
			businessElementTrace_lazy = () -> CashSettlement.mmInterbankSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalance2.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which the amount of money is moved.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalance4.mmSettlementDate);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}

		@Override
		public DateAndDateTimeChoice getValue(IntraBalance2 obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(IntraBalance2 obj, DateAndDateTimeChoice value) {
			obj.setSettlementDate(value);
		}
	};
	@XmlElement(name = "BalFr", required = true)
	protected CashSubBalanceTypeAndQuantityBreakdown1 balanceFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1
	 * CashSubBalanceTypeAndQuantityBreakdown1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashBalance
	 * CashEntry.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2 IntraBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalFr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance from which the amount of money is moved."</li>
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalance4#mmBalanceFrom
	 * IntraBalance4.mmBalanceFrom}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalance2, CashSubBalanceTypeAndQuantityBreakdown1> mmBalanceFrom = new MMMessageAssociationEnd<IntraBalance2, CashSubBalanceTypeAndQuantityBreakdown1>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalance2.mmObject();
			isDerived = false;
			xmlTag = "BalFr";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::FROM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceFrom";
			definition = "Balance from which the amount of money is moved.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalance4.mmBalanceFrom);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashSubBalanceTypeAndQuantityBreakdown1.mmObject();
		}

		@Override
		public CashSubBalanceTypeAndQuantityBreakdown1 getValue(IntraBalance2 obj) {
			return obj.getBalanceFrom();
		}

		@Override
		public void setValue(IntraBalance2 obj, CashSubBalanceTypeAndQuantityBreakdown1 value) {
			obj.setBalanceFrom(value);
		}
	};
	@XmlElement(name = "BalTo", required = true)
	protected CashSubBalanceTypeAndQuantityBreakdown1 balanceTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CashSubBalanceTypeAndQuantityBreakdown1
	 * CashSubBalanceTypeAndQuantityBreakdown1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashBalance
	 * CashEntry.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2 IntraBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance to which the amount of money is moved."</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.IntraBalance4#mmBalanceTo
	 * IntraBalance4.mmBalanceTo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalance2, CashSubBalanceTypeAndQuantityBreakdown1> mmBalanceTo = new MMMessageAssociationEnd<IntraBalance2, CashSubBalanceTypeAndQuantityBreakdown1>() {
		{
			businessElementTrace_lazy = () -> CashEntry.mmCashBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalance2.mmObject();
			isDerived = false;
			xmlTag = "BalTo";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":93A::TOBA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTo";
			definition = "Balance to which the amount of money is moved.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalance4.mmBalanceTo);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CashSubBalanceTypeAndQuantityBreakdown1.mmObject();
		}

		@Override
		public CashSubBalanceTypeAndQuantityBreakdown1 getValue(IntraBalance2 obj) {
			return obj.getBalanceTo();
		}

		@Override
		public void setValue(IntraBalance2 obj, CashSubBalanceTypeAndQuantityBreakdown1 value) {
			obj.setBalanceTo(value);
		}
	};
	@XmlElement(name = "CshSubBalId")
	protected GenericIdentification37 cashSubBalanceIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2 IntraBalance2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSubBalId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSubBalanceIdentification"</li>
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalance4#mmCashSubBalanceIdentification
	 * IntraBalance4.mmCashSubBalanceIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IntraBalance2, Optional<GenericIdentification37>> mmCashSubBalanceIdentification = new MMMessageAssociationEnd<IntraBalance2, Optional<GenericIdentification37>>() {
		{
			businessComponentTrace_lazy = () -> CashBalance.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalance2.mmObject();
			isDerived = false;
			xmlTag = "CshSubBalId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSubBalanceIdentification";
			definition = "Number identifying a lot constituting the sub-balance.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalance4.mmCashSubBalanceIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> GenericIdentification37.mmObject();
		}

		@Override
		public Optional<GenericIdentification37> getValue(IntraBalance2 obj) {
			return obj.getCashSubBalanceIdentification();
		}

		@Override
		public void setValue(IntraBalance2 obj, Optional<GenericIdentification37> value) {
			obj.setCashSubBalanceIdentification(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalance2 IntraBalance2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.IntraBalance4#mmInstructionProcessingAdditionalDetails
	 * IntraBalance4.mmInstructionProcessingAdditionalDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IntraBalance2, Optional<Max350Text>> mmInstructionProcessingAdditionalDetails = new MMMessageAttribute<IntraBalance2, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IntraBalance2.mmObject();
			isDerived = false;
			xmlTag = "InstrPrcgAddtlDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":70E::SPRO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionProcessingAdditionalDetails";
			definition = "Provides additional settlement processing information which can not be included within the structured fields of the message.";
			nextVersions_lazy = () -> Arrays.asList(IntraBalance4.mmInstructionProcessingAdditionalDetails);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(IntraBalance2 obj) {
			return obj.getInstructionProcessingAdditionalDetails();
		}

		@Override
		public void setValue(IntraBalance2 obj, Optional<Max350Text> value) {
			obj.setInstructionProcessingAdditionalDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IntraBalance2.mmSettledAmount, com.tools20022.repository.msg.IntraBalance2.mmPreviouslySettledAmount,
						com.tools20022.repository.msg.IntraBalance2.mmRemainingSettlementAmount, com.tools20022.repository.msg.IntraBalance2.mmSettlementDate, com.tools20022.repository.msg.IntraBalance2.mmBalanceFrom,
						com.tools20022.repository.msg.IntraBalance2.mmBalanceTo, com.tools20022.repository.msg.IntraBalance2.mmCashSubBalanceIdentification,
						com.tools20022.repository.msg.IntraBalance2.mmInstructionProcessingAdditionalDetails);
				trace_lazy = () -> BookEntry.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraBalance2";
				definition = "Details of the intra-balance movement.";
				nextVersions_lazy = () -> Arrays.asList(IntraBalance4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Amount2Choice> getSettledAmount() {
		return settledAmount == null ? Optional.empty() : Optional.of(settledAmount);
	}

	public IntraBalance2 setSettledAmount(Amount2Choice settledAmount) {
		this.settledAmount = settledAmount;
		return this;
	}

	public Optional<Amount2Choice> getPreviouslySettledAmount() {
		return previouslySettledAmount == null ? Optional.empty() : Optional.of(previouslySettledAmount);
	}

	public IntraBalance2 setPreviouslySettledAmount(Amount2Choice previouslySettledAmount) {
		this.previouslySettledAmount = previouslySettledAmount;
		return this;
	}

	public Optional<Amount2Choice> getRemainingSettlementAmount() {
		return remainingSettlementAmount == null ? Optional.empty() : Optional.of(remainingSettlementAmount);
	}

	public IntraBalance2 setRemainingSettlementAmount(Amount2Choice remainingSettlementAmount) {
		this.remainingSettlementAmount = remainingSettlementAmount;
		return this;
	}

	public DateAndDateTimeChoice getSettlementDate() {
		return settlementDate;
	}

	public IntraBalance2 setSettlementDate(DateAndDateTimeChoice settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public CashSubBalanceTypeAndQuantityBreakdown1 getBalanceFrom() {
		return balanceFrom;
	}

	public IntraBalance2 setBalanceFrom(CashSubBalanceTypeAndQuantityBreakdown1 balanceFrom) {
		this.balanceFrom = Objects.requireNonNull(balanceFrom);
		return this;
	}

	public CashSubBalanceTypeAndQuantityBreakdown1 getBalanceTo() {
		return balanceTo;
	}

	public IntraBalance2 setBalanceTo(CashSubBalanceTypeAndQuantityBreakdown1 balanceTo) {
		this.balanceTo = Objects.requireNonNull(balanceTo);
		return this;
	}

	public Optional<GenericIdentification37> getCashSubBalanceIdentification() {
		return cashSubBalanceIdentification == null ? Optional.empty() : Optional.of(cashSubBalanceIdentification);
	}

	public IntraBalance2 setCashSubBalanceIdentification(GenericIdentification37 cashSubBalanceIdentification) {
		this.cashSubBalanceIdentification = cashSubBalanceIdentification;
		return this;
	}

	public Optional<Max350Text> getInstructionProcessingAdditionalDetails() {
		return instructionProcessingAdditionalDetails == null ? Optional.empty() : Optional.of(instructionProcessingAdditionalDetails);
	}

	public IntraBalance2 setInstructionProcessingAdditionalDetails(Max350Text instructionProcessingAdditionalDetails) {
		this.instructionProcessingAdditionalDetails = instructionProcessingAdditionalDetails;
		return this;
	}
}