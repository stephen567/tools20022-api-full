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
import com.tools20022.repository.choice.InvestmentFundTransactionInType1Choice;
import com.tools20022.repository.choice.QuantityType1Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.FundsCashFlow;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Breakdown of cash movements into a fund as a result of investment funds
 * transactions, eg, subscriptions or switch-in.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#Amount
 * FundCashInBreakdown3.Amount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#UnitsNumber
 * FundCashInBreakdown3.UnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#NewAmountIndicator
 * FundCashInBreakdown3.NewAmountIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#InvestmentFundTransactionInType
 * FundCashInBreakdown3.InvestmentFundTransactionInType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#OriginalOrderQuantityType
 * FundCashInBreakdown3.OriginalOrderQuantityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#ChargeDetails
 * FundCashInBreakdown3.ChargeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#CommissionDetails
 * FundCashInBreakdown3.CommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3#SettlementCurrency
 * FundCashInBreakdown3.SettlementCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
 * FundsCashFlow}</li>
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
 * "FundCashInBreakdown3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Breakdown of cash movements into a fund as a result of investment funds transactions, eg, subscriptions or switch-in."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2
 * FundCashInBreakdown2}</li>
 * </ul>
 */
public class FundCashInBreakdown3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Amount of cash flow in, expressed as an amount of money.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Amount
	 * SecuritiesQuantity.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
	 * FundCashInBreakdown3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of cash flow in, expressed as an amount of money."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#Amount
	 * FundCashInBreakdown2.Amount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Amount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FundCashInBreakdown3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Amount;
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Amount of cash flow in, expressed as an amount of money.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown2.Amount;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Amount of the cash flow in, expressed as a number of units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#Unit
	 * SecuritiesQuantity.Unit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
	 * FundCashInBreakdown3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of the cash flow in,  expressed as a number of units."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#UnitsNumber
	 * FundCashInBreakdown2.UnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute UnitsNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FundCashInBreakdown3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Unit;
			isDerived = false;
			xmlTag = "UnitsNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Amount of the cash flow in,  expressed as a number of units.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown2.UnitsNumber;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}
	};
	/**
	 * Indicates whether the cash flow is an item that did not appear on the
	 * previously sent report, for example, because it was received close to
	 * cut-off time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
	 * FundCashInBreakdown3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewAmtInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewAmountIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the cash flow is an item that did not appear on the previously sent report, for example, because it was received close to cut-off time."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#NewAmountIndicator
	 * FundCashInBreakdown2.NewAmountIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute NewAmountIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FundCashInBreakdown3.mmObject();
			isDerived = false;
			xmlTag = "NewAmtInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewAmountIndicator";
			definition = "Indicates whether the cash flow is an item that did not appear on the previously sent report, for example, because it was received close to cut-off time.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown2.NewAmountIndicator;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Type of transaction that resulted in the cash-in movement, for example,
	 * subscription, switch-in.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InvestmentFundTransactionInType1Choice
	 * InvestmentFundTransactionInType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#Type
	 * InvestmentFundTransaction.Type}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
	 * FundCashInBreakdown3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtFndTxInTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundTransactionInType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of transaction that resulted in the cash-in movement, for example, subscription, switch-in. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd InvestmentFundTransactionInType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FundCashInBreakdown3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.Type;
			isDerived = false;
			xmlTag = "InvstmtFndTxInTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentFundTransactionInType";
			definition = "Type of transaction that resulted in the cash-in movement, for example, subscription, switch-in. ";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> InvestmentFundTransactionInType1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Specifies how the original order was expressed that resulted in the
	 * cash-in movement, that is cash or units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.QuantityType1Choice
	 * QuantityType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#QuantityType
	 * SecuritiesOrder.QuantityType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
	 * FundCashInBreakdown3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlOrdrQtyTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalOrderQuantityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the original order was expressed that resulted in the cash-in movement, that is cash or units."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OriginalOrderQuantityType = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FundCashInBreakdown3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.QuantityType;
			isDerived = false;
			xmlTag = "OrgnlOrdrQtyTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalOrderQuantityType";
			definition = "Specifies how the original order was expressed that resulted in the cash-in movement, that is cash or units.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> QuantityType1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Charge for the placement of an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge26 Charge26}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#TransactionCharge
	 * InvestmentFundTransaction.TransactionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
	 * FundCashInBreakdown3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge for the placement of an order."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#ChargeDetails
	 * FundCashInBreakdown2.ChargeDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ChargeDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FundCashInBreakdown3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.InvestmentFundTransaction.TransactionCharge;
			isDerived = false;
			xmlTag = "ChrgDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeDetails";
			definition = "Charge for the placement of an order.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown2.ChargeDetails;
			minOccurs = 0;
			type_lazy = () -> Charge26.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Information related to the commission applied to an order, for example,
	 * back-end or front-end commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commission21
	 * Commission21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#TradeCommission
	 * Trade.TradeCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
	 * FundCashInBreakdown3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the commission applied to an order, for example, back-end or front-end commission."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown2#CommissionDetails
	 * FundCashInBreakdown2.CommissionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CommissionDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> FundCashInBreakdown3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Trade.TradeCommission;
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Information related to the commission applied to an order, for example, back-end or front-end commission.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.FundCashInBreakdown2.CommissionDetails;
			minOccurs = 0;
			type_lazy = () -> Commission21.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Settlement currency for the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#SettlementCurrency
	 * SecuritiesOrder.SettlementCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundCashInBreakdown3
	 * FundCashInBreakdown3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement currency for the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SettlementCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> FundCashInBreakdown3.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.SettlementCurrency;
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Settlement currency for the transaction.";
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundCashInBreakdown3.Amount, com.tools20022.repository.msg.FundCashInBreakdown3.UnitsNumber,
						com.tools20022.repository.msg.FundCashInBreakdown3.NewAmountIndicator, com.tools20022.repository.msg.FundCashInBreakdown3.InvestmentFundTransactionInType,
						com.tools20022.repository.msg.FundCashInBreakdown3.OriginalOrderQuantityType, com.tools20022.repository.msg.FundCashInBreakdown3.ChargeDetails, com.tools20022.repository.msg.FundCashInBreakdown3.CommissionDetails,
						com.tools20022.repository.msg.FundCashInBreakdown3.SettlementCurrency);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FundCashInBreakdown3";
				definition = "Breakdown of cash movements into a fund as a result of investment funds transactions, eg, subscriptions or switch-in.";
				previousVersion_lazy = () -> FundCashInBreakdown2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}