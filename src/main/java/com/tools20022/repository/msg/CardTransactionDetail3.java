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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.MessageReason1Code;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.datatype.Max35NumericText;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.Instalment;
import com.tools20022.repository.entity.ObligationFulfilment;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the card transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmTransactionAmounts
 * CardTransactionDetail3.mmTransactionAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmTransactionFees
 * CardTransactionDetail3.mmTransactionFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmAdditionalAmounts
 * CardTransactionDetail3.mmAdditionalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmMessageReason
 * CardTransactionDetail3.mmMessageReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmValidityDate
 * CardTransactionDetail3.mmValidityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmUnattendedLevelCategory
 * CardTransactionDetail3.mmUnattendedLevelCategory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmAccountFrom
 * CardTransactionDetail3.mmAccountFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmAccountTo
 * CardTransactionDetail3.mmAccountTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmInstalment
 * CardTransactionDetail3.mmInstalment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmAntiMoneyLaundering
 * CardTransactionDetail3.mmAntiMoneyLaundering}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3#mmICCRelatedData
 * CardTransactionDetail3.mmICCRelatedData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "CardTransactionDetail3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the card transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1
 * CardTransactionDetail1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CardTransactionDetail3", propOrder = {"transactionAmounts", "transactionFees", "additionalAmounts", "messageReason", "validityDate", "unattendedLevelCategory", "accountFrom", "accountTo", "instalment",
		"antiMoneyLaundering", "iCCRelatedData"})
public class CardTransactionDetail3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxAmts", required = true)
	protected CardTransactionAmount3 transactionAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardTransactionAmount3
	 * CardTransactionAmount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3
	 * CardTransactionDetail3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amounts of the transaction expressed within the terminal currency."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmTransactionAmounts
	 * CardTransactionDetail1.mmTransactionAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionAmounts = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail3.mmObject();
			isDerived = false;
			xmlTag = "TxAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionAmounts";
			definition = "Amounts of the transaction expressed within the terminal currency.";
			previousVersion_lazy = () -> CardTransactionDetail1.mmTransactionAmounts;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardTransactionAmount3.mmObject();
		}
	};
	@XmlElement(name = "TxFees")
	protected List<com.tools20022.repository.msg.DetailedAmount11> transactionFees;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount11
	 * DetailedAmount11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAmount
	 * Payment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3
	 * CardTransactionDetail3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fees between acquirer and issuer exclusive of the transaction amount, and expressed in the currency of the reconciliation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionFees = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail3.mmObject();
			isDerived = false;
			xmlTag = "TxFees";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionFees";
			definition = "Fees between acquirer and issuer exclusive of the transaction amount, and expressed in the currency of the reconciliation.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount11.mmObject();
		}
	};
	@XmlElement(name = "AddtlAmts")
	protected List<com.tools20022.repository.msg.DetailedAmount10> additionalAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.DetailedAmount10
	 * DetailedAmount10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmDetailedAmount
	 * CardPayment.mmDetailedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3
	 * CardTransactionDetail3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional amounts from the processor or the issuer without financial impacts on the transaction amount."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmAdditionalAmounts
	 * CardTransactionDetail1.mmAdditionalAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalAmounts = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmDetailedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail3.mmObject();
			isDerived = false;
			xmlTag = "AddtlAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalAmounts";
			definition = "Additional amounts from the processor or the issuer without financial impacts on the transaction amount.";
			previousVersion_lazy = () -> CardTransactionDetail1.mmAdditionalAmounts;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedAmount10.mmObject();
		}
	};
	@XmlElement(name = "MsgRsn")
	protected MessageReason1Code messageReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3
	 * CardTransactionDetail3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason to send a card acquirer to issuer message.\r\nIt corresponds to ISO 8583 field number 25 for the version 93, and field number 9 for the version 2003."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmMessageReason
	 * CardTransactionDetail1.mmMessageReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageReason = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail3.mmObject();
			isDerived = false;
			xmlTag = "MsgRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageReason";
			definition = "Reason to send a card acquirer to issuer message.\r\nIt corresponds to ISO 8583 field number 25 for the version 93, and field number 9 for the version 2003.";
			previousVersion_lazy = () -> CardTransactionDetail1.mmMessageReason;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	@XmlElement(name = "VldtyDt")
	protected ISODate validityDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
	 * ObligationFulfilment.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3
	 * CardTransactionDetail3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VldtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction authorisation deadline to complete the related payment.\r\nIt corresponds to ISO 8583 field number 57 for the version 93, and field number 3 for the version 2003."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmValidityDate
	 * CardTransactionDetail1.mmValidityDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValidityDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ObligationFulfilment.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail3.mmObject();
			isDerived = false;
			xmlTag = "VldtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidityDate";
			definition = "Transaction authorisation deadline to complete the related payment.\r\nIt corresponds to ISO 8583 field number 57 for the version 93, and field number 3 for the version 2003.";
			previousVersion_lazy = () -> CardTransactionDetail1.mmValidityDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "UattnddLvlCtgy")
	protected Max35NumericText unattendedLevelCategory;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max35NumericText
	 * Max35NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3
	 * CardTransactionDetail3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UattnddLvlCtgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnattendedLevelCategory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction category level on an unattended terminal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmUnattendedLevelCategory
	 * CardTransactionDetail1.mmUnattendedLevelCategory}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnattendedLevelCategory = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail3.mmObject();
			isDerived = false;
			xmlTag = "UattnddLvlCtgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnattendedLevelCategory";
			definition = "Transaction category level on an unattended terminal.";
			previousVersion_lazy = () -> CardTransactionDetail1.mmUnattendedLevelCategory;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35NumericText.mmObject();
		}
	};
	@XmlElement(name = "AcctFr")
	protected CardAccount1 accountFrom;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAccount1
	 * CardAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAccount
	 * Payment.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3
	 * CardTransactionDetail3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Way to identify a customer account or a relationship to its account affected for debits, inquiries and the “from” account for transfers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmAccountFrom
	 * CardTransactionDetail1.mmAccountFrom}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountFrom = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail3.mmObject();
			isDerived = false;
			xmlTag = "AcctFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountFrom";
			definition = "Way to identify a customer account or a relationship to its account affected for debits, inquiries and the “from” account for transfers.";
			previousVersion_lazy = () -> CardTransactionDetail1.mmAccountFrom;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardAccount1.mmObject();
		}
	};
	@XmlElement(name = "AcctTo")
	protected CardAccount1 accountTo;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAccount1
	 * CardAccount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAccount
	 * Payment.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3
	 * CardTransactionDetail3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountTo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Way to identify a customer account or a relationship to its account affected for credits and the “to” account for transfers."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmAccountTo
	 * CardTransactionDetail1.mmAccountTo}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAccountTo = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail3.mmObject();
			isDerived = false;
			xmlTag = "AcctTo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountTo";
			definition = "Way to identify a customer account or a relationship to its account affected for credits and the “to” account for transfers.";
			previousVersion_lazy = () -> CardTransactionDetail1.mmAccountTo;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardAccount1.mmObject();
		}
	};
	@XmlElement(name = "Instlmt")
	protected RecurringTransaction2 instalment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RecurringTransaction2
	 * RecurringTransaction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Instalment Instalment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3
	 * CardTransactionDetail3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Instlmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instalment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to a financial loan (instalment) or to a recurring transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmInstalment
	 * CardTransactionDetail1.mmInstalment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInstalment = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Instalment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail3.mmObject();
			isDerived = false;
			xmlTag = "Instlmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instalment";
			definition = "Data related to a financial loan (instalment) or to a recurring transaction.";
			previousVersion_lazy = () -> CardTransactionDetail1.mmInstalment;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RecurringTransaction2.mmObject();
		}
	};
	@XmlElement(name = "AML")
	protected AntiMoneyLaundering1 antiMoneyLaundering;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AntiMoneyLaundering1
	 * AntiMoneyLaundering1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3
	 * CardTransactionDetail3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AML"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AntiMoneyLaundering"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information requested against money laundering for a transfer transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmAntiMoneyLaundering
	 * CardTransactionDetail1.mmAntiMoneyLaundering}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAntiMoneyLaundering = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail3.mmObject();
			isDerived = false;
			xmlTag = "AML";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AntiMoneyLaundering";
			definition = "Information requested against money laundering for a transfer transaction.";
			previousVersion_lazy = () -> CardTransactionDetail1.mmAntiMoneyLaundering;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AntiMoneyLaundering1.mmObject();
		}
	};
	@XmlElement(name = "ICCRltdData")
	protected Max10000Binary iCCRelatedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail3
	 * CardTransactionDetail3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ICCRltdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICCRelatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Data related to an integrated circuit card application.\r\nIt corresponds to ISO 8583 field number 55 for the versions 93 and 2003."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CardTransactionDetail1#mmICCRelatedData
	 * CardTransactionDetail1.mmICCRelatedData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmICCRelatedData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CardTransactionDetail3.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Data related to an integrated circuit card application.\r\nIt corresponds to ISO 8583 field number 55 for the versions 93 and 2003.";
			previousVersion_lazy = () -> CardTransactionDetail1.mmICCRelatedData;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CardTransactionDetail3.mmTransactionAmounts, com.tools20022.repository.msg.CardTransactionDetail3.mmTransactionFees,
						com.tools20022.repository.msg.CardTransactionDetail3.mmAdditionalAmounts, com.tools20022.repository.msg.CardTransactionDetail3.mmMessageReason, com.tools20022.repository.msg.CardTransactionDetail3.mmValidityDate,
						com.tools20022.repository.msg.CardTransactionDetail3.mmUnattendedLevelCategory, com.tools20022.repository.msg.CardTransactionDetail3.mmAccountFrom, com.tools20022.repository.msg.CardTransactionDetail3.mmAccountTo,
						com.tools20022.repository.msg.CardTransactionDetail3.mmInstalment, com.tools20022.repository.msg.CardTransactionDetail3.mmAntiMoneyLaundering, com.tools20022.repository.msg.CardTransactionDetail3.mmICCRelatedData);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardTransactionDetail3";
				definition = "Details of the card transaction.";
				previousVersion_lazy = () -> CardTransactionDetail1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardTransactionAmount3 getTransactionAmounts() {
		return transactionAmounts;
	}

	public CardTransactionDetail3 setTransactionAmounts(com.tools20022.repository.msg.CardTransactionAmount3 transactionAmounts) {
		this.transactionAmounts = Objects.requireNonNull(transactionAmounts);
		return this;
	}

	public List<DetailedAmount11> getTransactionFees() {
		return transactionFees == null ? transactionFees = new ArrayList<>() : transactionFees;
	}

	public CardTransactionDetail3 setTransactionFees(List<com.tools20022.repository.msg.DetailedAmount11> transactionFees) {
		this.transactionFees = Objects.requireNonNull(transactionFees);
		return this;
	}

	public List<DetailedAmount10> getAdditionalAmounts() {
		return additionalAmounts == null ? additionalAmounts = new ArrayList<>() : additionalAmounts;
	}

	public CardTransactionDetail3 setAdditionalAmounts(List<com.tools20022.repository.msg.DetailedAmount10> additionalAmounts) {
		this.additionalAmounts = Objects.requireNonNull(additionalAmounts);
		return this;
	}

	public Optional<MessageReason1Code> getMessageReason() {
		return messageReason == null ? Optional.empty() : Optional.of(messageReason);
	}

	public CardTransactionDetail3 setMessageReason(MessageReason1Code messageReason) {
		this.messageReason = messageReason;
		return this;
	}

	public Optional<ISODate> getValidityDate() {
		return validityDate == null ? Optional.empty() : Optional.of(validityDate);
	}

	public CardTransactionDetail3 setValidityDate(ISODate validityDate) {
		this.validityDate = validityDate;
		return this;
	}

	public Optional<Max35NumericText> getUnattendedLevelCategory() {
		return unattendedLevelCategory == null ? Optional.empty() : Optional.of(unattendedLevelCategory);
	}

	public CardTransactionDetail3 setUnattendedLevelCategory(Max35NumericText unattendedLevelCategory) {
		this.unattendedLevelCategory = unattendedLevelCategory;
		return this;
	}

	public Optional<CardAccount1> getAccountFrom() {
		return accountFrom == null ? Optional.empty() : Optional.of(accountFrom);
	}

	public CardTransactionDetail3 setAccountFrom(com.tools20022.repository.msg.CardAccount1 accountFrom) {
		this.accountFrom = accountFrom;
		return this;
	}

	public Optional<CardAccount1> getAccountTo() {
		return accountTo == null ? Optional.empty() : Optional.of(accountTo);
	}

	public CardTransactionDetail3 setAccountTo(com.tools20022.repository.msg.CardAccount1 accountTo) {
		this.accountTo = accountTo;
		return this;
	}

	public Optional<RecurringTransaction2> getInstalment() {
		return instalment == null ? Optional.empty() : Optional.of(instalment);
	}

	public CardTransactionDetail3 setInstalment(com.tools20022.repository.msg.RecurringTransaction2 instalment) {
		this.instalment = instalment;
		return this;
	}

	public Optional<AntiMoneyLaundering1> getAntiMoneyLaundering() {
		return antiMoneyLaundering == null ? Optional.empty() : Optional.of(antiMoneyLaundering);
	}

	public CardTransactionDetail3 setAntiMoneyLaundering(com.tools20022.repository.msg.AntiMoneyLaundering1 antiMoneyLaundering) {
		this.antiMoneyLaundering = antiMoneyLaundering;
		return this;
	}

	public Optional<Max10000Binary> getICCRelatedData() {
		return iCCRelatedData == null ? Optional.empty() : Optional.of(iCCRelatedData);
	}

	public CardTransactionDetail3 setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
		return this;
	}
}