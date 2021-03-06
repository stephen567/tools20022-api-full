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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionAmendmentV04;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionV04;
import com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04;
import com.tools20022.repository.area.other.ForeignExchangeTradeInstructionAmendmentV02;
import com.tools20022.repository.area.other.ForeignExchangeTradeInstructionCancellationV02;
import com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02;
import com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02;
import com.tools20022.repository.area.trea.*;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.ForeignExchangeTrade;
import com.tools20022.repository.entity.Trade;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the value date and the amounts traded in a foreign exchange
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate1#mmTradingSideBuyAmount
 * AmountsAndValueDate1.mmTradingSideBuyAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate1#mmTradingSideSellAmount
 * AmountsAndValueDate1.mmTradingSideSellAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate1#mmSettlementDate
 * AmountsAndValueDate1.mmSettlementDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade
 * ForeignExchangeTrade}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionAmendmentV02#mmTradeAmounts
 * ForeignExchangeTradeInstructionAmendmentV02.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionCancellationV02#mmTradeAmounts
 * ForeignExchangeTradeInstructionCancellationV02.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeInstructionV02#mmTradeAmounts
 * ForeignExchangeTradeInstructionV02.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.other.ForeignExchangeTradeStatusAndDetailsNotificationV02#mmTradeAmounts
 * ForeignExchangeTradeStatusAndDetailsNotificationV02.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardOpeningV02#mmTradeAmounts
 * CreateNonDeliverableForwardOpeningV02.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendNonDeliverableForwardOpeningV02#mmTradeAmounts
 * AmendNonDeliverableForwardOpeningV02.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardOpeningV02#mmTradeAmounts
 * CancelNonDeliverableForwardOpeningV02.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CreateNonDeliverableForwardValuationV02#mmTradeAmounts
 * CreateNonDeliverableForwardValuationV02.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.AmendNonDeliverableForwardValuationV02#mmTradeAmounts
 * AmendNonDeliverableForwardValuationV02.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.trea.CancelNonDeliverableForwardValuationV02#mmTradeAmounts
 * CancelNonDeliverableForwardValuationV02.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionV04#mmTradeAmounts
 * ForeignExchangeTradeInstructionV04.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionCancellationV04#mmTradeAmounts
 * ForeignExchangeTradeInstructionCancellationV04.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeInstructionAmendmentV04#mmTradeAmounts
 * ForeignExchangeTradeInstructionAmendmentV04.mmTradeAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.fxtr.ForeignExchangeTradeStatusAndDetailsNotificationV04#mmTradeAmounts
 * ForeignExchangeTradeStatusAndDetailsNotificationV04.mmTradeAmounts}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AmountsAndValueDate1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the value date and the amounts traded in a foreign exchange transaction."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AmountsAndValueDate1", propOrder = {"tradingSideBuyAmount", "tradingSideSellAmount", "settlementDate"})
public class AmountsAndValueDate1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TradgSdBuyAmt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount tradingSideBuyAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmBuyAmount
	 * ForeignExchangeTrade.mmBuyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate1
	 * AmountsAndValueDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSdBuyAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSideBuyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency and amount bought in a foreign exchange trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountsAndValueDate1, ActiveOrHistoricCurrencyAndAmount> mmTradingSideBuyAmount = new MMMessageAttribute<AmountsAndValueDate1, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmBuyAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountsAndValueDate1.mmObject();
			isDerived = false;
			xmlTag = "TradgSdBuyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideBuyAmount";
			definition = "Currency and amount bought in a foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(AmountsAndValueDate1 obj) {
			return obj.getTradingSideBuyAmount();
		}

		@Override
		public void setValue(AmountsAndValueDate1 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setTradingSideBuyAmount(value);
		}
	};
	@XmlElement(name = "TradgSdSellAmt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount tradingSideSellAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmSellAmount
	 * ForeignExchangeTrade.mmSellAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate1
	 * AmountsAndValueDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradgSdSellAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingSideSellAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency and amount sold in a foreign exchange trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountsAndValueDate1, ActiveOrHistoricCurrencyAndAmount> mmTradingSideSellAmount = new MMMessageAttribute<AmountsAndValueDate1, ActiveOrHistoricCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmSellAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountsAndValueDate1.mmObject();
			isDerived = false;
			xmlTag = "TradgSdSellAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingSideSellAmount";
			definition = "Currency and amount sold in a foreign exchange trade.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveOrHistoricCurrencyAndAmount getValue(AmountsAndValueDate1 obj) {
			return obj.getTradingSideSellAmount();
		}

		@Override
		public void setValue(AmountsAndValueDate1 obj, ActiveOrHistoricCurrencyAndAmount value) {
			obj.setTradingSideSellAmount(value);
		}
	};
	@XmlElement(name = "SttlmDt", required = true)
	protected ISODate settlementDate;
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
	 * {@linkplain com.tools20022.repository.entity.Trade#mmValueDate
	 * Trade.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AmountsAndValueDate1
	 * AmountsAndValueDate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the trade is settled, ie, the amounts are due."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AmountsAndValueDate1, ISODate> mmSettlementDate = new MMMessageAttribute<AmountsAndValueDate1, ISODate>() {
		{
			businessElementTrace_lazy = () -> Trade.mmValueDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.AmountsAndValueDate1.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the trade is settled, ie, the amounts are due.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(AmountsAndValueDate1 obj) {
			return obj.getSettlementDate();
		}

		@Override
		public void setValue(AmountsAndValueDate1 obj, ISODate value) {
			obj.setSettlementDate(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AmountsAndValueDate1.mmTradingSideBuyAmount, com.tools20022.repository.msg.AmountsAndValueDate1.mmTradingSideSellAmount,
						com.tools20022.repository.msg.AmountsAndValueDate1.mmSettlementDate);
				messageBuildingBlock_lazy = () -> Arrays.asList(ForeignExchangeTradeInstructionAmendmentV02.mmTradeAmounts, ForeignExchangeTradeInstructionCancellationV02.mmTradeAmounts, ForeignExchangeTradeInstructionV02.mmTradeAmounts,
						ForeignExchangeTradeStatusAndDetailsNotificationV02.mmTradeAmounts, CreateNonDeliverableForwardOpeningV02.mmTradeAmounts, AmendNonDeliverableForwardOpeningV02.mmTradeAmounts,
						CancelNonDeliverableForwardOpeningV02.mmTradeAmounts, CreateNonDeliverableForwardValuationV02.mmTradeAmounts, AmendNonDeliverableForwardValuationV02.mmTradeAmounts,
						CancelNonDeliverableForwardValuationV02.mmTradeAmounts, ForeignExchangeTradeInstructionV04.mmTradeAmounts, ForeignExchangeTradeInstructionCancellationV04.mmTradeAmounts,
						ForeignExchangeTradeInstructionAmendmentV04.mmTradeAmounts, ForeignExchangeTradeStatusAndDetailsNotificationV04.mmTradeAmounts);
				trace_lazy = () -> ForeignExchangeTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AmountsAndValueDate1";
				definition = "Specifies the value date and the amounts traded in a foreign exchange transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyAndAmount getTradingSideBuyAmount() {
		return tradingSideBuyAmount;
	}

	public AmountsAndValueDate1 setTradingSideBuyAmount(ActiveOrHistoricCurrencyAndAmount tradingSideBuyAmount) {
		this.tradingSideBuyAmount = Objects.requireNonNull(tradingSideBuyAmount);
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getTradingSideSellAmount() {
		return tradingSideSellAmount;
	}

	public AmountsAndValueDate1 setTradingSideSellAmount(ActiveOrHistoricCurrencyAndAmount tradingSideSellAmount) {
		this.tradingSideSellAmount = Objects.requireNonNull(tradingSideSellAmount);
		return this;
	}

	public ISODate getSettlementDate() {
		return settlementDate;
	}

	public AmountsAndValueDate1 setSettlementDate(ISODate settlementDate) {
		this.settlementDate = Objects.requireNonNull(settlementDate);
		return this;
	}
}