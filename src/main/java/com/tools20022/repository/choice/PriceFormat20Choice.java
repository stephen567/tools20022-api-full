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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.repository.codeset.PriceValueType8Code;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.msg.AmountPrice3;
import com.tools20022.repository.msg.AmountPricePerAmount2;
import com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3;
import com.tools20022.repository.msg.PercentagePrice1;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;

/**
 * Choice between a percentage price or an amount price or an unspecified price
 * or an amount price per amount or an amount price per financial instrument
 * quantity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice#PercentagePrice
 * PriceFormat20Choice.PercentagePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice#AmountPrice
 * PriceFormat20Choice.AmountPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice#NotSpecifiedPrice
 * PriceFormat20Choice.NotSpecifiedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice#AmountPricePerFinancialInstrumentQuantity
 * PriceFormat20Choice.AmountPricePerFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice#AmountPricePerAmount
 * PriceFormat20Choice.AmountPricePerAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
 * SecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceFormat20Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a percentage price or an amount price or an unspecified price or an amount price per amount or an amount price per financial instrument quantity."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat32Choice
 * PriceFormat32Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class PriceFormat20Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Price expressed as a percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PercentagePrice1
	 * PercentagePrice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#Rate
	 * SecuritiesPricing.Rate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice
	 * PriceFormat20Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentagePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a percentage."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat32Choice#PercentagePrice
	 * PriceFormat32Choice.PercentagePrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd PercentagePrice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PriceFormat20Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.Rate;
			isDerived = false;
			xmlTag = "PctgPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentagePrice";
			definition = "Price expressed as a percentage.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceFormat32Choice.PercentagePrice);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> PercentagePrice1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Price expressed as a currency and amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountPrice3
	 * AmountPrice3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#Amount Price.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice
	 * PriceFormat20Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a currency and amount."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat32Choice#AmountPrice
	 * PriceFormat32Choice.AmountPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AmountPrice = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PriceFormat20Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Price.Amount;
			isDerived = false;
			xmlTag = "AmtPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPrice";
			definition = "Price expressed as a currency and amount.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceFormat32Choice.AmountPrice);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountPrice3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Value of the price not specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType8Code
	 * PriceValueType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice
	 * PriceFormat20Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotSpcfdPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price not specified."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat32Choice#NotSpecifiedPrice
	 * PriceFormat32Choice.NotSpecifiedPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute NotSpecifiedPrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PriceFormat20Choice.mmObject();
			isDerived = false;
			xmlTag = "NotSpcfdPric";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedPrice";
			definition = "Value of the price not specified.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceFormat32Choice.NotSpecifiedPrice);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PriceValueType8Code.mmObject();
		}
	};
	/**
	 * Price expressed as a ratio: amount price per financial instrument
	 * quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity3
	 * AmountPricePerFinancialInstrumentQuantity3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#AmountPricePerFinancialInstrumentQuantity
	 * SecuritiesPricing.AmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice
	 * PriceFormat20Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtPricPerFinInstrmQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPricePerFinancialInstrumentQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price expressed as a ratio: amount price per financial instrument quantity."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat32Choice#AmountPricePerFinancialInstrumentQuantity
	 * PriceFormat32Choice.AmountPricePerFinancialInstrumentQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AmountPricePerFinancialInstrumentQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PriceFormat20Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.AmountPricePerFinancialInstrumentQuantity;
			isDerived = false;
			xmlTag = "AmtPricPerFinInstrmQty";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPricePerFinancialInstrumentQuantity";
			definition = "Price expressed as a ratio: amount price per financial instrument quantity.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceFormat32Choice.AmountPricePerFinancialInstrumentQuantity);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountPricePerFinancialInstrumentQuantity3.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Price expressed as a ratio: amount price per amount
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountPricePerAmount2
	 * AmountPricePerAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#AmountPricePerAmount
	 * SecuritiesPricing.AmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat20Choice
	 * PriceFormat20Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtPricPerAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPricePerAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a ratio: amount price per amount"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat32Choice#AmountPricePerAmount
	 * PriceFormat32Choice.AmountPricePerAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd AmountPricePerAmount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PriceFormat20Choice.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.AmountPricePerAmount;
			isDerived = false;
			xmlTag = "AmtPricPerAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPricePerAmount";
			definition = "Price expressed as a ratio: amount price per amount";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceFormat32Choice.AmountPricePerAmount);
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> AmountPricePerAmount2.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceFormat20Choice.PercentagePrice, com.tools20022.repository.choice.PriceFormat20Choice.AmountPrice,
						com.tools20022.repository.choice.PriceFormat20Choice.NotSpecifiedPrice, com.tools20022.repository.choice.PriceFormat20Choice.AmountPricePerFinancialInstrumentQuantity,
						com.tools20022.repository.choice.PriceFormat20Choice.AmountPricePerAmount);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PriceFormat20Choice";
				definition = "Choice between a percentage price or an amount price or an unspecified price or an amount price per amount or an amount price per financial instrument quantity.";
				nextVersions_lazy = () -> Arrays.asList(PriceFormat32Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}