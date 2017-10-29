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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Totals for the value of the holdings reported in the statement or page.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement2#TotalHoldingsValueOfPage
 * TotalValueInPageAndStatement2.TotalHoldingsValueOfPage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement2#TotalHoldingsValueOfStatement
 * TotalValueInPageAndStatement2.TotalHoldingsValueOfStatement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement2#TotalBookValueOfStatement
 * TotalValueInPageAndStatement2.TotalBookValueOfStatement}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03#AccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV03.AccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03#AlternateReportingCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV03.AlternateReportingCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04#AccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV04.AccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04#AlternateReportingCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV04.AlternateReportingCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV05#AccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV05.AccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV05#AlternateReportingCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV05.AlternateReportingCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV06#AccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV06.AccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV06#AlternateReportingCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV06.AlternateReportingCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#AccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV07.AccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07#AlternateReportingCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV07.AlternateReportingCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#AccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV08.AccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08#AlternateReportingCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV08.AlternateReportingCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#AccountBaseCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV09.AccountBaseCurrencyTotalAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09#AlternateReportingCurrencyTotalAmounts
 * SecuritiesBalanceAccountingReportV09.AlternateReportingCurrencyTotalAmounts}</li>
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
 * "TotalValueInPageAndStatement2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Totals for the value of the holdings reported in the statement or page."</li>
 * </ul>
 */
public class TotalValueInPageAndStatement2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Total value of positions reported in this message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement2
	 * TotalValueInPageAndStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlHldgsValOfPg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalHoldingsValueOfPage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total value of positions reported in this message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute TotalHoldingsValueOfPage = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TotalValueInPageAndStatement2.mmObject();
			isDerived = false;
			xmlTag = "TtlHldgsValOfPg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalHoldingsValueOfPage";
			definition = "Total value of positions reported in this message.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> AmountAndDirection6.mmObject();
		}
	};
	/**
	 * Total value of positions reported in this statement (a statement may
	 * comprise one or more messages).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement2
	 * TotalValueInPageAndStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlHldgsValOfStmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalHoldingsValueOfStatement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total value of positions reported in this statement (a statement may comprise one or more messages)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TotalHoldingsValueOfStatement = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TotalValueInPageAndStatement2.mmObject();
			isDerived = false;
			xmlTag = "TtlHldgsValOfStmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalHoldingsValueOfStatement";
			definition = "Total value of positions reported in this statement (a statement may comprise one or more messages).";
			minOccurs = 1;
			maxOccurs = 1;
			complexType_lazy = () -> AmountAndDirection6.mmObject();
		}
	};
	/**
	 * Total book value of positions reported in this statement (a statement may
	 * comprise one or more messages).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndDirection6
	 * AmountAndDirection6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalValueInPageAndStatement2
	 * TotalValueInPageAndStatement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlBookValOfStmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalBookValueOfStatement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total book value of positions reported in this statement (a statement may comprise one or more messages)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute TotalBookValueOfStatement = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TotalValueInPageAndStatement2.mmObject();
			isDerived = false;
			xmlTag = "TtlBookValOfStmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalBookValueOfStatement";
			definition = "Total book value of positions reported in this statement (a statement may comprise one or more messages).";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> AmountAndDirection6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TotalValueInPageAndStatement2.TotalHoldingsValueOfPage, com.tools20022.repository.msg.TotalValueInPageAndStatement2.TotalHoldingsValueOfStatement,
						com.tools20022.repository.msg.TotalValueInPageAndStatement2.TotalBookValueOfStatement);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03.AccountBaseCurrencyTotalAmounts,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV03.AlternateReportingCurrencyTotalAmounts,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04.AccountBaseCurrencyTotalAmounts,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV04.AlternateReportingCurrencyTotalAmounts,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV05.AccountBaseCurrencyTotalAmounts,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV05.AlternateReportingCurrencyTotalAmounts,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV06.AccountBaseCurrencyTotalAmounts,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV06.AlternateReportingCurrencyTotalAmounts,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07.AccountBaseCurrencyTotalAmounts,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV07.AlternateReportingCurrencyTotalAmounts,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08.AccountBaseCurrencyTotalAmounts,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV08.AlternateReportingCurrencyTotalAmounts,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09.AccountBaseCurrencyTotalAmounts,
						com.tools20022.repository.area.semt.SecuritiesBalanceAccountingReportV09.AlternateReportingCurrencyTotalAmounts);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TotalValueInPageAndStatement2";
				definition = "Totals for the value of the holdings reported in the statement or page.";
			}
		});
		return mmObject_lazy.get();
	}
}