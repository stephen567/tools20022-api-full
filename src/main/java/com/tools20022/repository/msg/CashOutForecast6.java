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
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.FundsCashFlow;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Cash movements out of a fund as a result of investment funds transactions,
 * eg, redemptions or switch-out.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#CashSettlementDate
 * CashOutForecast6.CashSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#SubTotalAmount
 * CashOutForecast6.SubTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#SubTotalUnitsNumber
 * CashOutForecast6.SubTotalUnitsNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#ExceptionalCashFlowIndicator
 * CashOutForecast6.ExceptionalCashFlowIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CashOutForecast6#AdditionalBalance
 * CashOutForecast6.AdditionalBalance}</li>
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
 * "CashOutForecast6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Cash movements out of a fund as a result of investment funds transactions, eg, redemptions or switch-out."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CashOutForecast4 CashOutForecast4}</li>
 * </ul>
 */
public class CashOutForecast6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Date on which cash is available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashSettlement#InterbankSettlementDate
	 * CashSettlement.InterbankSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6
	 * CashOutForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which cash is available."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast4#CashSettlementDate
	 * CashOutForecast4.CashSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute CashSettlementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOutForecast6.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CashSettlement.InterbankSettlementDate;
			isDerived = false;
			xmlTag = "CshSttlmDt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDate";
			definition = "Date on which cash is available.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CashOutForecast4.CashSettlementDate;
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Sub-total amount of the cash flow out, expressed as an amount of money.
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
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6
	 * CashOutForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-total amount of the cash flow out, expressed as an amount of money."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast4#SubTotalAmount
	 * CashOutForecast4.SubTotalAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SubTotalAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOutForecast6.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Amount;
			isDerived = false;
			xmlTag = "SubTtlAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubTotalAmount";
			definition = "Sub-total amount of the cash flow out, expressed as an amount of money.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CashOutForecast4.SubTotalAmount;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Sub-total amount of the cash flow out, expressed as a number of units.
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
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6
	 * CashOutForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubTtlUnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubTotalUnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sub-total amount of the cash flow out, expressed as a number of units."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast4#SubTotalUnitsNumber
	 * CashOutForecast4.SubTotalUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute SubTotalUnitsNumber = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOutForecast6.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.Unit;
			isDerived = false;
			xmlTag = "SubTtlUnitsNb";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubTotalUnitsNumber";
			definition = "Sub-total amount of the cash flow out, expressed as a number of units.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CashOutForecast4.SubTotalUnitsNumber;
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}
	};
	/**
	 * Indicates whether the cash flow out is exceptional.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#ExceptionalCashFlowIndicator
	 * FundsCashFlow.ExceptionalCashFlowIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6
	 * CashOutForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XcptnlCshFlowInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalCashFlowIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the cash flow out is exceptional."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast4#ExceptionalCashFlowIndicator
	 * CashOutForecast4.ExceptionalCashFlowIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ExceptionalCashFlowIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CashOutForecast6.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.ExceptionalCashFlowIndicator;
			isDerived = false;
			xmlTag = "XcptnlCshFlowInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalCashFlowIndicator";
			definition = "Indicates whether the cash flow out is exceptional.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CashOutForecast4.ExceptionalCashFlowIndicator;
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Additional balances for cash amounts and number of units. <br>
	 * In an estimated report, the total cash derived from orders placed as a
	 * number of units is an estimated cash amount and the total number of units
	 * derived from orders placed as a cash amount is an estimated number of
	 * units.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FundBalance1
	 * FundBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CashOutForecast6
	 * CashOutForecast6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional balances for cash amounts and number of units. \r\nIn an estimated report, the total cash derived from orders placed as a number of units is an estimated cash amount and the total number of units derived from orders placed as a cash amount is an estimated number of units."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AdditionalBalance = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CashOutForecast6.mmObject();
			isDerived = false;
			xmlTag = "AddtlBal";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBalance";
			definition = "Additional balances for cash amounts and number of units. \r\nIn an estimated report, the total cash derived from orders placed as a number of units is an estimated cash amount and the total number of units derived from orders placed as a cash amount is an estimated number of units.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> FundBalance1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashOutForecast6.CashSettlementDate, com.tools20022.repository.msg.CashOutForecast6.SubTotalAmount,
						com.tools20022.repository.msg.CashOutForecast6.SubTotalUnitsNumber, com.tools20022.repository.msg.CashOutForecast6.ExceptionalCashFlowIndicator, com.tools20022.repository.msg.CashOutForecast6.AdditionalBalance);
				trace_lazy = () -> FundsCashFlow.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashOutForecast6";
				definition = "Cash movements out of a fund as a result of investment funds transactions, eg, redemptions or switch-out.";
				previousVersion_lazy = () -> CashOutForecast4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}