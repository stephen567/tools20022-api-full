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
import com.tools20022.repository.choice.IndicativeOrMarketPrice1Choice;
import com.tools20022.repository.choice.PriceFormat11Choice;
import com.tools20022.repository.entity.CorporateActionPrice;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies prices related to a corporate action option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice10#IndicativeOrMarketPrice
 * CorporateActionPrice10.IndicativeOrMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice10#CashInLieuOfSharePrice
 * CorporateActionPrice10.CashInLieuOfSharePrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionPrice
 * CorporateActionPrice}</li>
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
 * "CorporateActionPrice10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies prices related to a corporate action option."</li>
 * </ul>
 */
public class CorporateActionPrice10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates whether the price is an indicative price or a market price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice1Choice
	 * IndicativeOrMarketPrice1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice10
	 * CorporateActionPrice10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndctvOrMktPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndicativeOrMarketPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the price is an indicative price or a market price."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd IndicativeOrMarketPrice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CorporateActionPrice10.mmObject();
			businessComponentTrace_lazy = () -> CorporateActionPrice.mmObject();
			isDerived = false;
			xmlTag = "IndctvOrMktPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndicativeOrMarketPrice";
			definition = "Indicates whether the price is an indicative price or a market price.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> IndicativeOrMarketPrice1Choice.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Cash disbursement in lieu of equities; usually in lieu of fractional
	 * quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat11Choice
	 * PriceFormat11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#CashInLieuOfSharePrice
	 * CorporateActionPrice.CashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPrice10
	 * CorporateActionPrice10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshInLieuOfShrPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfSharePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash disbursement in lieu of equities; usually in lieu of fractional quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute CashInLieuOfSharePrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPrice10.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.CashInLieuOfSharePrice;
			isDerived = false;
			xmlTag = "CshInLieuOfShrPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfSharePrice";
			definition = "Cash disbursement in lieu of equities; usually in lieu of fractional quantity.";
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> PriceFormat11Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionPrice10.IndicativeOrMarketPrice, com.tools20022.repository.msg.CorporateActionPrice10.CashInLieuOfSharePrice);
				trace_lazy = () -> CorporateActionPrice.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPrice10";
				definition = "Specifies prices related to a corporate action option.";
			}
		});
		return mmObject_lazy.get();
	}
}