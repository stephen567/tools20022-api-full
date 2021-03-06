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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.FinancialInstrumentQuantityChoice;
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
 * Identifies elements related to a mass quote.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.MassQuote1#mmDefaultBidSize
 * MassQuote1.mmDefaultBidSize}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MassQuote1#mmDefaultOfferSize
 * MassQuote1.mmDefaultOfferSize}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MassQuote1#mmQuoteSetDetails
 * MassQuote1.mmQuoteSetDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MassQuote1#mmTradingParties
 * MassQuote1.mmTradingParties}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MassQuote1#mmCashParties
 * MassQuote1.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MassQuote1#mmReceivingSettlementParties
 * MassQuote1.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MassQuote1#mmDeliveringSettlementParties
 * MassQuote1.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MassQuote1#mmOtherBusinessParties
 * MassQuote1.mmOtherBusinessParties}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MassQuote1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies elements related to a mass quote."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MassQuote1", propOrder = {"defaultBidSize", "defaultOfferSize", "quoteSetDetails", "tradingParties", "cashParties", "receivingSettlementParties", "deliveringSettlementParties", "otherBusinessParties"})
public class MassQuote1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DfltBidSz")
	protected FinancialInstrumentQuantityChoice defaultBidSize;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmQuantity
	 * Quote.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.MassQuote1
	 * MassQuote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltBidSz"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultBidSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Default Bid Size for quote contained within this quote message - if not explicitly provided."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 293</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MassQuote1, Optional<FinancialInstrumentQuantityChoice>> mmDefaultBidSize = new MMMessageAttribute<MassQuote1, Optional<FinancialInstrumentQuantityChoice>>() {
		{
			businessElementTrace_lazy = () -> Quote.mmQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.MassQuote1.mmObject();
			isDerived = false;
			xmlTag = "DfltBidSz";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "293"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultBidSize";
			definition = "Default Bid Size for quote contained within this quote message - if not explicitly provided.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantityChoice> getValue(MassQuote1 obj) {
			return obj.getDefaultBidSize();
		}

		@Override
		public void setValue(MassQuote1 obj, Optional<FinancialInstrumentQuantityChoice> value) {
			obj.setDefaultBidSize(value.orElse(null));
		}
	};
	@XmlElement(name = "DfltOfferSz")
	protected FinancialInstrumentQuantityChoice defaultOfferSize;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantityChoice
	 * FinancialInstrumentQuantityChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmQuantity
	 * Quote.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.MassQuote1
	 * MassQuote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltOfferSz"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultOfferSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Default Offer Size for quotes contained within this quote message - if not explicitly provided."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 294</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MassQuote1, Optional<FinancialInstrumentQuantityChoice>> mmDefaultOfferSize = new MMMessageAttribute<MassQuote1, Optional<FinancialInstrumentQuantityChoice>>() {
		{
			businessElementTrace_lazy = () -> Quote.mmQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.MassQuote1.mmObject();
			isDerived = false;
			xmlTag = "DfltOfferSz";
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "294"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultOfferSize";
			definition = "Default Offer Size for quotes contained within this quote message - if not explicitly provided.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FinancialInstrumentQuantityChoice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantityChoice> getValue(MassQuote1 obj) {
			return obj.getDefaultOfferSize();
		}

		@Override
		public void setValue(MassQuote1 obj, Optional<FinancialInstrumentQuantityChoice> value) {
			obj.setDefaultOfferSize(value.orElse(null));
		}
	};
	@XmlElement(name = "QtSetDtls", required = true)
	protected List<QuoteSet1> quoteSetDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuoteSet1 QuoteSet1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmSecurityQuoteVariable
	 * Quote.mmSecurityQuoteVariable}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.MassQuote1
	 * MassQuote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtSetDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuoteSetDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about a group of related quotes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MassQuote1, List<QuoteSet1>> mmQuoteSetDetails = new MMMessageAssociationEnd<MassQuote1, List<QuoteSet1>>() {
		{
			businessElementTrace_lazy = () -> Quote.mmSecurityQuoteVariable;
			componentContext_lazy = () -> com.tools20022.repository.msg.MassQuote1.mmObject();
			isDerived = false;
			xmlTag = "QtSetDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuoteSetDetails";
			definition = "Provides details about a group of related quotes.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> QuoteSet1.mmObject();
		}

		@Override
		public List<QuoteSet1> getValue(MassQuote1 obj) {
			return obj.getQuoteSetDetails();
		}

		@Override
		public void setValue(MassQuote1 obj, List<QuoteSet1> value) {
			obj.setQuoteSetDetails(value);
		}
	};
	@XmlElement(name = "TradgPties")
	protected List<Intermediary14> tradingParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Intermediary14
	 * Intermediary14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradePartyRole
	 * Trade.mmTradePartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.MassQuote1
	 * MassQuote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parties used for acting parties that applies either to the whole message or to individual sides."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MassQuote1, List<Intermediary14>> mmTradingParties = new MMMessageAssociationEnd<MassQuote1, List<Intermediary14>>() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradePartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.MassQuote1.mmObject();
			isDerived = false;
			xmlTag = "TradgPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingParties";
			definition = "Parties used for acting parties that applies either to the whole message or to individual sides.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Intermediary14.mmObject();
		}

		@Override
		public List<Intermediary14> getValue(MassQuote1 obj) {
			return obj.getTradingParties();
		}

		@Override
		public void setValue(MassQuote1 obj, List<Intermediary14> value) {
			obj.setTradingParties(value);
		}
	};
	@XmlElement(name = "CshPties")
	protected CashParties1 cashParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashParties1
	 * CashParties1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
	 * Payment.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.MassQuote1
	 * MassQuote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment processes required to transfer cash from the debtor to the creditor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MassQuote1, Optional<CashParties1>> mmCashParties = new MMMessageAssociationEnd<MassQuote1, Optional<CashParties1>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmPartyRole;
			componentContext_lazy = () -> com.tools20022.repository.msg.MassQuote1.mmObject();
			isDerived = false;
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Payment processes required to transfer cash from the debtor to the creditor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashParties1.mmObject();
		}

		@Override
		public Optional<CashParties1> getValue(MassQuote1 obj) {
			return obj.getCashParties();
		}

		@Override
		public void setValue(MassQuote1 obj, Optional<CashParties1> value) {
			obj.setCashParties(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgSttlmPties")
	protected SettlementParties3 receivingSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties3
	 * SettlementParties3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.MassQuote1
	 * MassQuote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MassQuote1, Optional<SettlementParties3>> mmReceivingSettlementParties = new MMMessageAssociationEnd<MassQuote1, Optional<SettlementParties3>>() {
		{
			businessComponentTrace_lazy = () -> ReceivingSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MassQuote1.mmObject();
			isDerived = false;
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties3.mmObject();
		}

		@Override
		public Optional<SettlementParties3> getValue(MassQuote1 obj) {
			return obj.getReceivingSettlementParties();
		}

		@Override
		public void setValue(MassQuote1 obj, Optional<SettlementParties3> value) {
			obj.setReceivingSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvrgSttlmPties")
	protected SettlementParties3 deliveringSettlementParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties3
	 * SettlementParties3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.MassQuote1
	 * MassQuote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MassQuote1, Optional<SettlementParties3>> mmDeliveringSettlementParties = new MMMessageAssociationEnd<MassQuote1, Optional<SettlementParties3>>() {
		{
			businessComponentTrace_lazy = () -> DeliveringSettlementParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MassQuote1.mmObject();
			isDerived = false;
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementParties3.mmObject();
		}

		@Override
		public Optional<SettlementParties3> getValue(MassQuote1 obj) {
			return obj.getDeliveringSettlementParties();
		}

		@Override
		public void setValue(MassQuote1 obj, Optional<SettlementParties3> value) {
			obj.setDeliveringSettlementParties(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrBizPties")
	protected OtherParties1 otherBusinessParties;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherParties1
	 * OtherParties1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.MassQuote1
	 * MassQuote1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBizPties"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBusinessParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MassQuote1, Optional<OtherParties1>> mmOtherBusinessParties = new MMMessageAssociationEnd<MassQuote1, Optional<OtherParties1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MassQuote1.mmObject();
			isDerived = false;
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherParties1.mmObject();
		}

		@Override
		public Optional<OtherParties1> getValue(MassQuote1 obj) {
			return obj.getOtherBusinessParties();
		}

		@Override
		public void setValue(MassQuote1 obj, Optional<OtherParties1> value) {
			obj.setOtherBusinessParties(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MassQuote1.mmDefaultBidSize, com.tools20022.repository.msg.MassQuote1.mmDefaultOfferSize, com.tools20022.repository.msg.MassQuote1.mmQuoteSetDetails,
						com.tools20022.repository.msg.MassQuote1.mmTradingParties, com.tools20022.repository.msg.MassQuote1.mmCashParties, com.tools20022.repository.msg.MassQuote1.mmReceivingSettlementParties,
						com.tools20022.repository.msg.MassQuote1.mmDeliveringSettlementParties, com.tools20022.repository.msg.MassQuote1.mmOtherBusinessParties);
				trace_lazy = () -> Quote.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MassQuote1";
				definition = "Identifies elements related to a mass quote.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FinancialInstrumentQuantityChoice> getDefaultBidSize() {
		return defaultBidSize == null ? Optional.empty() : Optional.of(defaultBidSize);
	}

	public MassQuote1 setDefaultBidSize(FinancialInstrumentQuantityChoice defaultBidSize) {
		this.defaultBidSize = defaultBidSize;
		return this;
	}

	public Optional<FinancialInstrumentQuantityChoice> getDefaultOfferSize() {
		return defaultOfferSize == null ? Optional.empty() : Optional.of(defaultOfferSize);
	}

	public MassQuote1 setDefaultOfferSize(FinancialInstrumentQuantityChoice defaultOfferSize) {
		this.defaultOfferSize = defaultOfferSize;
		return this;
	}

	public List<QuoteSet1> getQuoteSetDetails() {
		return quoteSetDetails == null ? quoteSetDetails = new ArrayList<>() : quoteSetDetails;
	}

	public MassQuote1 setQuoteSetDetails(List<QuoteSet1> quoteSetDetails) {
		this.quoteSetDetails = Objects.requireNonNull(quoteSetDetails);
		return this;
	}

	public List<Intermediary14> getTradingParties() {
		return tradingParties == null ? tradingParties = new ArrayList<>() : tradingParties;
	}

	public MassQuote1 setTradingParties(List<Intermediary14> tradingParties) {
		this.tradingParties = Objects.requireNonNull(tradingParties);
		return this;
	}

	public Optional<CashParties1> getCashParties() {
		return cashParties == null ? Optional.empty() : Optional.of(cashParties);
	}

	public MassQuote1 setCashParties(CashParties1 cashParties) {
		this.cashParties = cashParties;
		return this;
	}

	public Optional<SettlementParties3> getReceivingSettlementParties() {
		return receivingSettlementParties == null ? Optional.empty() : Optional.of(receivingSettlementParties);
	}

	public MassQuote1 setReceivingSettlementParties(SettlementParties3 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
		return this;
	}

	public Optional<SettlementParties3> getDeliveringSettlementParties() {
		return deliveringSettlementParties == null ? Optional.empty() : Optional.of(deliveringSettlementParties);
	}

	public MassQuote1 setDeliveringSettlementParties(SettlementParties3 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
		return this;
	}

	public Optional<OtherParties1> getOtherBusinessParties() {
		return otherBusinessParties == null ? Optional.empty() : Optional.of(otherBusinessParties);
	}

	public MassQuote1 setOtherBusinessParties(OtherParties1 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
		return this;
	}
}