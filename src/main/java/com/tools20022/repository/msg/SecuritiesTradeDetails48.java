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
import com.tools20022.repository.area.sese.PortfolioTransferNotificationV04;
import com.tools20022.repository.choice.Reporting7Choice;
import com.tools20022.repository.choice.SettlementDate9Choice;
import com.tools20022.repository.choice.TradeDate5Choice;
import com.tools20022.repository.codeset.DeliveryReceiptType2Code;
import com.tools20022.repository.codeset.ReceiveDelivery1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max3Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the securities trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmNotificationSenderTransactionIdentification
 * SecuritiesTradeDetails48.mmNotificationSenderTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmNotificationReceiverTransactionIdentification
 * SecuritiesTradeDetails48.mmNotificationReceiverTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmCommonIdentification
 * SecuritiesTradeDetails48.mmCommonIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmSecuritiesMovementType
 * SecuritiesTradeDetails48.mmSecuritiesMovementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmPayment
 * SecuritiesTradeDetails48.mmPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmTradeDate
 * SecuritiesTradeDetails48.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmSettlementDate
 * SecuritiesTradeDetails48.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmNumberOfDaysAccrued
 * SecuritiesTradeDetails48.mmNumberOfDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmFinancialInstrumentIdentification
 * SecuritiesTradeDetails48.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmFinancialInstrumentAttributes
 * SecuritiesTradeDetails48.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmReporting
 * SecuritiesTradeDetails48.mmReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmQuantityDetails
 * SecuritiesTradeDetails48.mmQuantityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmSettlementParameters
 * SecuritiesTradeDetails48.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmDeliveringSettlementParties
 * SecuritiesTradeDetails48.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmReceivingSettlementParties
 * SecuritiesTradeDetails48.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmSettlementAmount
 * SecuritiesTradeDetails48.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmOtherAmounts
 * SecuritiesTradeDetails48.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmOtherBusinessParties
 * SecuritiesTradeDetails48.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48#mmSupplementaryData
 * SecuritiesTradeDetails48.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferNotificationV04#mmTransferNotificationDetails
 * PortfolioTransferNotificationV04.mmTransferNotificationDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTradeDetails48"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the securities trade."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTradeDateRule#forSecuritiesTradeDetails48
 * ConstraintTradeDateRule.forSecuritiesTradeDetails48}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementAmountRule#forSecuritiesTradeDetails48
 * ConstraintSettlementAmountRule.forSecuritiesTradeDetails48}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceivingParty1Rule#forSecuritiesTradeDetails48
 * ConstraintReceivingParty1Rule.forSecuritiesTradeDetails48}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDeliveringParty1Rule#forSecuritiesTradeDetails48
 * ConstraintDeliveringParty1Rule.forSecuritiesTradeDetails48}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72
 * SecuritiesTradeDetails72}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24
 * SecuritiesTradeDetails24}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesTradeDetails48", propOrder = {"notificationSenderTransactionIdentification", "notificationReceiverTransactionIdentification", "commonIdentification", "securitiesMovementType", "payment", "tradeDate",
		"settlementDate", "numberOfDaysAccrued", "financialInstrumentIdentification", "financialInstrumentAttributes", "reporting", "quantityDetails", "settlementParameters", "deliveringSettlementParties", "receivingSettlementParties",
		"settlementAmount", "otherAmounts", "otherBusinessParties", "supplementaryData"})
public class SecuritiesTradeDetails48 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NtfctnSndrTxId")
	protected Max35Text notificationSenderTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnSndrTxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationSenderTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the notification receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::PREV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmNotificationSenderTransactionIdentification
	 * SecuritiesTradeDetails72.mmNotificationSenderTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmNotificationSenderTransactionIdentification
	 * SecuritiesTradeDetails24.mmNotificationSenderTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails48, Optional<Max35Text>> mmNotificationSenderTransactionIdentification = new MMMessageAttribute<SecuritiesTradeDetails48, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "NtfctnSndrTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::PREV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationSenderTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the notification receiver.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmNotificationSenderTransactionIdentification);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmNotificationSenderTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SecuritiesTradeDetails48 obj) {
			return obj.getNotificationSenderTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, Optional<Max35Text> value) {
			obj.setNotificationSenderTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "NtfctnRcvrTxId")
	protected Max35Text notificationReceiverTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnRcvrTxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationReceiverTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the notification receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::RELA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmNotificationReceiverTransactionIdentification
	 * SecuritiesTradeDetails72.mmNotificationReceiverTransactionIdentification}
	 * </li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmNotificationReceiverTransactionIdentification
	 * SecuritiesTradeDetails24.mmNotificationReceiverTransactionIdentification}
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails48, Optional<Max35Text>> mmNotificationReceiverTransactionIdentification = new MMMessageAttribute<SecuritiesTradeDetails48, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "NtfctnRcvrTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::RELA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationReceiverTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the notification receiver.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmNotificationReceiverTransactionIdentification);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmNotificationReceiverTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SecuritiesTradeDetails48 obj) {
			return obj.getNotificationReceiverTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, Optional<Max35Text> value) {
			obj.setNotificationReceiverTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CmonId")
	protected Max35Text commonIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCommonIdentification
	 * TradeIdentification.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference agreed upon by the two trade counterparties to identify the trade."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::COMM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmCommonIdentification
	 * SecuritiesTradeDetails72.mmCommonIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmCommonIdentification
	 * SecuritiesTradeDetails24.mmCommonIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails48, Optional<Max35Text>> mmCommonIdentification = new MMMessageAttribute<SecuritiesTradeDetails48, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCommonIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "CmonId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::COMM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonIdentification";
			definition = "Unique reference agreed upon by the two trade counterparties to identify the trade.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmCommonIdentification);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmCommonIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(SecuritiesTradeDetails48 obj) {
			return obj.getCommonIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, Optional<Max35Text> value) {
			obj.setCommonIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesMvmntTp", required = true)
	protected ReceiveDelivery1Code securitiesMovementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReceiveDelivery1Code
	 * ReceiveDelivery1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecuritiesMovementType
	 * SecuritiesSettlement.mmSecuritiesMovementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesMvmntTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesMovementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the movement on a securities account results from a deliver or a receive instruction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::REDE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmSecuritiesMovementType
	 * SecuritiesTradeDetails72.mmSecuritiesMovementType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmSecuritiesMovementType
	 * SecuritiesTradeDetails24.mmSecuritiesMovementType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails48, ReceiveDelivery1Code> mmSecuritiesMovementType = new MMMessageAttribute<SecuritiesTradeDetails48, ReceiveDelivery1Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSecuritiesMovementType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "SctiesMvmntTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::REDE"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesMovementType";
			definition = "Specifies if the movement on a securities account results from a deliver or a receive instruction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmSecuritiesMovementType);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmSecuritiesMovementType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReceiveDelivery1Code.mmObject();
		}

		@Override
		public ReceiveDelivery1Code getValue(SecuritiesTradeDetails48 obj) {
			return obj.getSecuritiesMovementType();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, ReceiveDelivery1Code value) {
			obj.setSecuritiesMovementType(value);
		}
	};
	@XmlElement(name = "Pmt", required = true)
	protected DeliveryReceiptType2Code payment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryReceiptType2Code
	 * DeliveryReceiptType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementType
	 * SecuritiesSettlement.mmSettlementType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the transaction is to be settled, for example, against payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22H::PAYM</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmPayment
	 * SecuritiesTradeDetails72.mmPayment}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmPayment
	 * SecuritiesTradeDetails24.mmPayment}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails48, DeliveryReceiptType2Code> mmPayment = new MMMessageAttribute<SecuritiesTradeDetails48, DeliveryReceiptType2Code>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "Pmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22H::PAYM"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			definition = "Specifies how the transaction is to be settled, for example, against payment.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmPayment);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmPayment;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryReceiptType2Code.mmObject();
		}

		@Override
		public DeliveryReceiptType2Code getValue(SecuritiesTradeDetails48 obj) {
			return obj.getPayment();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, DeliveryReceiptType2Code value) {
			obj.setPayment(value);
		}
	};
	@XmlElement(name = "TradDt")
	protected TradeDate5Choice tradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.TradeDate5Choice
	 * TradeDate5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the date/time on which the trade was executed."</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmTradeDate
	 * SecuritiesTradeDetails72.mmTradeDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmTradeDate
	 * SecuritiesTradeDetails24.mmTradeDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails48, Optional<TradeDate5Choice>> mmTradeDate = new MMMessageAssociationEnd<SecuritiesTradeDetails48, Optional<TradeDate5Choice>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::TRAD"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Specifies the date/time on which the trade was executed.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmTradeDate);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmTradeDate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> TradeDate5Choice.mmObject();
		}

		@Override
		public Optional<TradeDate5Choice> getValue(SecuritiesTradeDetails48 obj) {
			return obj.getTradeDate();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, Optional<TradeDate5Choice> value) {
			obj.setTradeDate(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmDt", required = true)
	protected SettlementDate9Choice settlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementDate9Choice
	 * SettlementDate9Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are to be delivered or received."</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmSettlementDate
	 * SecuritiesTradeDetails72.mmSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmSettlementDate
	 * SecuritiesTradeDetails24.mmSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails48, SettlementDate9Choice> mmSettlementDate = new MMMessageAssociationEnd<SecuritiesTradeDetails48, SettlementDate9Choice>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date and time at which the securities are to be delivered or received.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmSettlementDate);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmSettlementDate;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementDate9Choice.mmObject();
		}

		@Override
		public SettlementDate9Choice getValue(SecuritiesTradeDetails48 obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, SettlementDate9Choice value) {
			obj.setSettlementDate(value);
		}
	};
	@XmlElement(name = "NbOfDaysAcrd")
	protected Max3Number numberOfDaysAccrued;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max3Number
	 * Max3Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDaysAcrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDaysAccrued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of days on which the interest rate accrues (daily accrual note)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :99A::DAAC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails72.mmNumberOfDaysAccrued}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmNumberOfDaysAccrued
	 * SecuritiesTradeDetails24.mmNumberOfDaysAccrued}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecuritiesTradeDetails48, Optional<Max3Number>> mmNumberOfDaysAccrued = new MMMessageAttribute<SecuritiesTradeDetails48, Optional<Max3Number>>() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysAcrd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":99A::DAAC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysAccrued";
			definition = "Number of days on which the interest rate accrues (daily accrual note).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmNumberOfDaysAccrued);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmNumberOfDaysAccrued;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3Number.mmObject();
		}

		@Override
		public Optional<Max3Number> getValue(SecuritiesTradeDetails48 obj) {
			return obj.getNumberOfDaysAccrued();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, Optional<Max3Number> value) {
			obj.setNumberOfDaysAccrued(value.orElse(null));
		}
	};
	@XmlElement(name = "FinInstrmId", required = true)
	protected SecurityIdentification19 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification19
	 * SecurityIdentification19}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmFinancialInstrumentIdentification
	 * SecuritiesTradeDetails72.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmFinancialInstrumentIdentification
	 * SecuritiesTradeDetails24.mmFinancialInstrumentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails48, SecurityIdentification19> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<SecuritiesTradeDetails48, SecurityIdentification19>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":35B:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Financial instruments representing a sum of rights of the investor vis-a-vis the issuer.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmFinancialInstrumentIdentification);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmFinancialInstrumentIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityIdentification19.mmObject();
		}

		@Override
		public SecurityIdentification19 getValue(SecuritiesTradeDetails48 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, SecurityIdentification19 value) {
			obj.setFinancialInstrumentIdentification(value);
		}
	};
	@XmlElement(name = "FinInstrmAttrbts")
	protected FinancialInstrumentAttributes64 financialInstrumentAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes64
	 * FinancialInstrumentAttributes64}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmSecurity
	 * SecuritiesTrade.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Elements characterising a financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:FIA</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails72.mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmFinancialInstrumentAttributes
	 * SecuritiesTradeDetails24.mmFinancialInstrumentAttributes}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails48, Optional<FinancialInstrumentAttributes64>> mmFinancialInstrumentAttributes = new MMMessageAssociationEnd<SecuritiesTradeDetails48, Optional<FinancialInstrumentAttributes64>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmSecurity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrbts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:FIA"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Elements characterising a financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmFinancialInstrumentAttributes);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmFinancialInstrumentAttributes;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes64.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentAttributes64> getValue(SecuritiesTradeDetails48 obj) {
			return obj.getFinancialInstrumentAttributes();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, Optional<FinancialInstrumentAttributes64> value) {
			obj.setFinancialInstrumentAttributes(value.orElse(null));
		}
	};
	@XmlElement(name = "Rptg")
	protected List<Reporting7Choice> reporting;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Reporting7Choice
	 * Reporting7Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rptg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reporting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies that a trade is to be reported to a third party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::RPOR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmReporting
	 * SecuritiesTradeDetails72.mmReporting}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmReporting
	 * SecuritiesTradeDetails24.mmReporting}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails48, List<Reporting7Choice>> mmReporting = new MMMessageAssociationEnd<SecuritiesTradeDetails48, List<Reporting7Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "Rptg";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::RPOR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			definition = "Specifies that a trade is to be reported to a third party.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmReporting);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmReporting;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Reporting7Choice.mmObject();
		}

		@Override
		public List<Reporting7Choice> getValue(SecuritiesTradeDetails48 obj) {
			return obj.getReporting();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, List<Reporting7Choice> value) {
			obj.setReporting(value);
		}
	};
	@XmlElement(name = "QtyDtls", required = true)
	protected Quantity11 quantityDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Quantity11 Quantity11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details about the financial instrument quantity involved in the transfer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:FIAC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmQuantityDetails
	 * SecuritiesTradeDetails72.mmQuantityDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmQuantityDetails
	 * SecuritiesTradeDetails24.mmQuantityDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails48, Quantity11> mmQuantityDetails = new MMMessageAssociationEnd<SecuritiesTradeDetails48, Quantity11>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "QtyDtls";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:FIAC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityDetails";
			definition = "Details about the financial instrument quantity involved in the transfer.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmQuantityDetails);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmQuantityDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Quantity11.mmObject();
		}

		@Override
		public Quantity11 getValue(SecuritiesTradeDetails48 obj) {
			return obj.getQuantityDetails();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, Quantity11 value) {
			obj.setQuantityDetails(value);
		}
	};
	@XmlElement(name = "SttlmParams")
	protected SettlementDetails100 settlementParameters;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementDetails100
	 * SettlementDetails100}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmParams"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters applied to the settlement of a security transfer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:SETDET</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmSettlementParameters
	 * SecuritiesTradeDetails72.mmSettlementParameters}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmSettlementParameters
	 * SecuritiesTradeDetails24.mmSettlementParameters}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails48, Optional<SettlementDetails100>> mmSettlementParameters = new MMMessageAssociationEnd<SecuritiesTradeDetails48, Optional<SettlementDetails100>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "SttlmParams";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SETDET"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters applied to the settlement of a security transfer.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmSettlementParameters);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmSettlementParameters;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementDetails100.mmObject();
		}

		@Override
		public Optional<SettlementDetails100> getValue(SecuritiesTradeDetails48 obj) {
			return obj.getSettlementParameters();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, Optional<SettlementDetails100> value) {
			obj.setSettlementParameters(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties36 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of delivering settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:SETPRTY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails72.mmDeliveringSettlementParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmDeliveringSettlementParties
	 * SecuritiesTradeDetails24.mmDeliveringSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails48, Optional<SettlementParties36>> mmDeliveringSettlementParties = new MMMessageAssociationEnd<SecuritiesTradeDetails48, Optional<SettlementParties36>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "DlvrgSttlmPties";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SETPRTY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmDeliveringSettlementParties);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmDeliveringSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties36.mmObject();
		}

		@Override
		public Optional<SettlementParties36> getValue(SecuritiesTradeDetails48 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, Optional<SettlementParties36> value) {
			obj.setDeliveringSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties36 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties36
	 * SettlementParties36}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmPartyRole
	 * SecuritiesSettlement.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of receiving settlement parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:SETPRTY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmReceivingSettlementParties
	 * SecuritiesTradeDetails72.mmReceivingSettlementParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmReceivingSettlementParties
	 * SecuritiesTradeDetails24.mmReceivingSettlementParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails48, Optional<SettlementParties36>> mmReceivingSettlementParties = new MMMessageAssociationEnd<SecuritiesTradeDetails48, Optional<SettlementParties36>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "RcvgSttlmPties";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:SETPRTY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmReceivingSettlementParties);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmReceivingSettlementParties;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties36.mmObject();
		}

		@Override
		public Optional<SettlementParties36> getValue(SecuritiesTradeDetails48 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, Optional<SettlementParties36> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmAmt")
	protected AmountAndDirection52 settlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection52
	 * AmountAndDirection52}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementAmount
	 * Obligation.mmRequestedSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be paid or received in exchange for the securities."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :19A::SETT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmSettlementAmount
	 * SecuritiesTradeDetails72.mmSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmSettlementAmount
	 * SecuritiesTradeDetails24.mmSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails48, Optional<AmountAndDirection52>> mmSettlementAmount = new MMMessageAssociationEnd<SecuritiesTradeDetails48, Optional<AmountAndDirection52>>() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":19A::SETT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmSettlementAmount);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmSettlementAmount;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AmountAndDirection52.mmObject();
		}

		@Override
		public Optional<AmountAndDirection52> getValue(SecuritiesTradeDetails48 obj) {
			return obj.getSettlementAmount();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, Optional<AmountAndDirection52> value) {
			obj.setSettlementAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrAmts")
	protected OtherAmounts29 otherAmounts;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherAmounts29
	 * OtherAmounts29}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAmts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other amounts than the settlement amount."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:AMT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmOtherAmounts
	 * SecuritiesTradeDetails72.mmOtherAmounts}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmOtherAmounts
	 * SecuritiesTradeDetails24.mmOtherAmounts}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails48, Optional<OtherAmounts29>> mmOtherAmounts = new MMMessageAssociationEnd<SecuritiesTradeDetails48, Optional<OtherAmounts29>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTrade.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "OthrAmts";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:AMT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmOtherAmounts);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmOtherAmounts;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherAmounts29.mmObject();
		}

		@Override
		public Optional<OtherAmounts29> getValue(SecuritiesTradeDetails48 obj) {
			return obj.getOtherAmounts();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, Optional<OtherAmounts29> value) {
			obj.setOtherAmounts(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties26 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherParties26
	 * OtherParties26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmPartyRole
	 * SecuritiesTrade.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBizPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBusinessParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other business parties relevant to the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :16R:OTHPRTY</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmOtherBusinessParties
	 * SecuritiesTradeDetails72.mmOtherBusinessParties}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmOtherBusinessParties
	 * SecuritiesTradeDetails24.mmOtherBusinessParties}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails48, Optional<OtherParties26>> mmOtherBusinessParties = new MMMessageAssociationEnd<SecuritiesTradeDetails48, Optional<OtherParties26>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTrade.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "OthrBizPties";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":16R:OTHPRTY"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmOtherBusinessParties);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmOtherBusinessParties;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherParties26.mmObject();
		}

		@Override
		public Optional<OtherParties26> getValue(SecuritiesTradeDetails48 obj) {
			return obj.getOtherBusinessParties();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, Optional<OtherParties26> value) {
			obj.setOtherBusinessParties(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails48
	 * SecuritiesTradeDetails48}</li>
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails72#mmSupplementaryData
	 * SecuritiesTradeDetails72.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails24#mmSupplementaryData
	 * SecuritiesTradeDetails24.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesTradeDetails48, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<SecuritiesTradeDetails48, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails48.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmSupplementaryData);
			previousVersion_lazy = () -> SecuritiesTradeDetails24.mmSupplementaryData;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesTradeDetails48 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesTradeDetails48 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesTradeDetails48.mmNotificationSenderTransactionIdentification,
						com.tools20022.repository.msg.SecuritiesTradeDetails48.mmNotificationReceiverTransactionIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails48.mmCommonIdentification,
						com.tools20022.repository.msg.SecuritiesTradeDetails48.mmSecuritiesMovementType, com.tools20022.repository.msg.SecuritiesTradeDetails48.mmPayment, com.tools20022.repository.msg.SecuritiesTradeDetails48.mmTradeDate,
						com.tools20022.repository.msg.SecuritiesTradeDetails48.mmSettlementDate, com.tools20022.repository.msg.SecuritiesTradeDetails48.mmNumberOfDaysAccrued,
						com.tools20022.repository.msg.SecuritiesTradeDetails48.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.SecuritiesTradeDetails48.mmFinancialInstrumentAttributes,
						com.tools20022.repository.msg.SecuritiesTradeDetails48.mmReporting, com.tools20022.repository.msg.SecuritiesTradeDetails48.mmQuantityDetails,
						com.tools20022.repository.msg.SecuritiesTradeDetails48.mmSettlementParameters, com.tools20022.repository.msg.SecuritiesTradeDetails48.mmDeliveringSettlementParties,
						com.tools20022.repository.msg.SecuritiesTradeDetails48.mmReceivingSettlementParties, com.tools20022.repository.msg.SecuritiesTradeDetails48.mmSettlementAmount,
						com.tools20022.repository.msg.SecuritiesTradeDetails48.mmOtherAmounts, com.tools20022.repository.msg.SecuritiesTradeDetails48.mmOtherBusinessParties,
						com.tools20022.repository.msg.SecuritiesTradeDetails48.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(PortfolioTransferNotificationV04.mmTransferNotificationDetails);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTradeDateRule.forSecuritiesTradeDetails48,
						com.tools20022.repository.constraints.ConstraintSettlementAmountRule.forSecuritiesTradeDetails48, com.tools20022.repository.constraints.ConstraintReceivingParty1Rule.forSecuritiesTradeDetails48,
						com.tools20022.repository.constraints.ConstraintDeliveringParty1Rule.forSecuritiesTradeDetails48);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTradeDetails48";
				definition = "Details of the securities trade.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesTradeDetails72.mmObject());
				previousVersion_lazy = () -> SecuritiesTradeDetails24.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getNotificationSenderTransactionIdentification() {
		return notificationSenderTransactionIdentification == null ? Optional.empty() : Optional.of(notificationSenderTransactionIdentification);
	}

	public SecuritiesTradeDetails48 setNotificationSenderTransactionIdentification(Max35Text notificationSenderTransactionIdentification) {
		this.notificationSenderTransactionIdentification = notificationSenderTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getNotificationReceiverTransactionIdentification() {
		return notificationReceiverTransactionIdentification == null ? Optional.empty() : Optional.of(notificationReceiverTransactionIdentification);
	}

	public SecuritiesTradeDetails48 setNotificationReceiverTransactionIdentification(Max35Text notificationReceiverTransactionIdentification) {
		this.notificationReceiverTransactionIdentification = notificationReceiverTransactionIdentification;
		return this;
	}

	public Optional<Max35Text> getCommonIdentification() {
		return commonIdentification == null ? Optional.empty() : Optional.of(commonIdentification);
	}

	public SecuritiesTradeDetails48 setCommonIdentification(Max35Text commonIdentification) {
		this.commonIdentification = commonIdentification;
		return this;
	}

	public ReceiveDelivery1Code getSecuritiesMovementType() {
		return securitiesMovementType;
	}

	public SecuritiesTradeDetails48 setSecuritiesMovementType(ReceiveDelivery1Code securitiesMovementType) {
		this.securitiesMovementType = Objects.requireNonNull(securitiesMovementType);
		return this;
	}

	public DeliveryReceiptType2Code getPayment() {
		return payment;
	}

	public SecuritiesTradeDetails48 setPayment(DeliveryReceiptType2Code payment) {
		this.payment = Objects.requireNonNull(payment);
		return this;
	}

	public Optional<TradeDate5Choice> getTradeDate() {
		return tradeDate == null ? Optional.empty() : Optional.of(tradeDate);
	}

	public SecuritiesTradeDetails48 setTradeDate(TradeDate5Choice tradeDate) {
		this.tradeDate = tradeDate;
		return this;
	}

	public SettlementDate9Choice getSettlementDate() {
		return settlementDate;
	}

	public SecuritiesTradeDetails48 setSettlementDate(SettlementDate9Choice settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}

	public Optional<Max3Number> getNumberOfDaysAccrued() {
		return numberOfDaysAccrued == null ? Optional.empty() : Optional.of(numberOfDaysAccrued);
	}

	public SecuritiesTradeDetails48 setNumberOfDaysAccrued(Max3Number numberOfDaysAccrued) {
		this.numberOfDaysAccrued = numberOfDaysAccrued;
		return this;
	}

	public SecurityIdentification19 getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification;
	}

	public SecuritiesTradeDetails48 setFinancialInstrumentIdentification(SecurityIdentification19 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = Objects.requireNonNull(financialInstrumentIdentification);
		return this;
	}

	public Optional<FinancialInstrumentAttributes64> getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes == null ? Optional.empty() : Optional.of(financialInstrumentAttributes);
	}

	public SecuritiesTradeDetails48 setFinancialInstrumentAttributes(FinancialInstrumentAttributes64 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
		return this;
	}

	public List<Reporting7Choice> getReporting() {
		return reporting == null ? reporting = new ArrayList<>() : reporting;
	}

	public SecuritiesTradeDetails48 setReporting(List<Reporting7Choice> reporting) {
		this.reporting = Objects.requireNonNull(reporting);
		return this;
	}

	public Quantity11 getQuantityDetails() {
		return quantityDetails;
	}

	public SecuritiesTradeDetails48 setQuantityDetails(Quantity11 quantityDetails) {
		this.quantityDetails = Objects.requireNonNull(quantityDetails);
		return this;
	}

	public Optional<SettlementDetails100> getSettlementParameters() {
		return settlementParameters == null ? Optional.empty() : Optional.of(settlementParameters);
	}

	public SecuritiesTradeDetails48 setSettlementParameters(SettlementDetails100 settlementParameters) {
		this.settlementParameters = settlementParameters;
		return this;
	}

	public Optional<SettlementParties36> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public SecuritiesTradeDetails48 setDeliveringSettlementParties(SettlementParties36 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<SettlementParties36> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public SecuritiesTradeDetails48 setReceivingSettlementParties(SettlementParties36 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<AmountAndDirection52> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public SecuritiesTradeDetails48 setSettlementAmount(AmountAndDirection52 settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<OtherAmounts29> getOtherAmounts() {
		return otherAmounts == null ? Optional.empty() : Optional.of(otherAmounts);
	}

	public SecuritiesTradeDetails48 setOtherAmounts(OtherAmounts29 otherAmounts) {
		this.otherAmounts = otherAmounts;
		return this;
	}

	public Optional<OtherParties26> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public SecuritiesTradeDetails48 setOtherBusinessParties(OtherParties26 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesTradeDetails48 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}