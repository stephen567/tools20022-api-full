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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of formats for the price.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown3Choice#mmRate
 * PriceRateOrAmountOrUnknown3Choice.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown3Choice#mmAmount
 * PriceRateOrAmountOrUnknown3Choice.mmAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown3Choice#mmUnknownIndicator
 * PriceRateOrAmountOrUnknown3Choice.mmUnknownIndicator}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceRateOrAmountOrUnknown3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of formats for the price."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PriceRateOrAmountOrUnknown3Choice", propOrder = {"rate", "amount", "unknownIndicator"})
public class PriceRateOrAmountOrUnknown3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rate", required = true)
	protected PercentageRate rate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRate
	 * SecuritiesPricing.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown3Choice
	 * PriceRateOrAmountOrUnknown3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a rate, ie, percentage."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceRateOrAmountOrUnknown3Choice, PercentageRate> mmRate = new MMMessageAttribute<PriceRateOrAmountOrUnknown3Choice, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceRateOrAmountOrUnknown3Choice.mmObject();
			isDerived = false;
			xmlTag = "Rate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rate";
			definition = "Price expressed as a rate, ie, percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(PriceRateOrAmountOrUnknown3Choice obj) {
			return obj.getRate();
		}

		@Override
		public void setValue(PriceRateOrAmountOrUnknown3Choice obj, PercentageRate value) {
			obj.setRate(value);
		}
	};
	@XmlElement(name = "Amt", required = true)
	protected RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount
	 * RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown3Choice
	 * PriceRateOrAmountOrUnknown3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a currency and value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceRateOrAmountOrUnknown3Choice, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount> mmAmount = new MMMessageAttribute<PriceRateOrAmountOrUnknown3Choice, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceRateOrAmountOrUnknown3Choice.mmObject();
			isDerived = false;
			xmlTag = "Amt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amount";
			definition = "Price expressed as a currency and value.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount getValue(PriceRateOrAmountOrUnknown3Choice obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(PriceRateOrAmountOrUnknown3Choice obj, RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount value) {
			obj.setAmount(value);
		}
	};
	@XmlElement(name = "UknwnInd", required = true)
	protected YesNoIndicator unknownIndicator;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown3Choice
	 * PriceRateOrAmountOrUnknown3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UknwnInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the market price is unknown."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceRateOrAmountOrUnknown3Choice, YesNoIndicator> mmUnknownIndicator = new MMMessageAttribute<PriceRateOrAmountOrUnknown3Choice, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceRateOrAmountOrUnknown3Choice.mmObject();
			isDerived = false;
			xmlTag = "UknwnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownIndicator";
			definition = "Indicates whether the market price is unknown.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(PriceRateOrAmountOrUnknown3Choice obj) {
			return obj.getUnknownIndicator();
		}

		@Override
		public void setValue(PriceRateOrAmountOrUnknown3Choice obj, YesNoIndicator value) {
			obj.setUnknownIndicator(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceRateOrAmountOrUnknown3Choice.mmRate, com.tools20022.repository.choice.PriceRateOrAmountOrUnknown3Choice.mmAmount,
						com.tools20022.repository.choice.PriceRateOrAmountOrUnknown3Choice.mmUnknownIndicator);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceRateOrAmountOrUnknown3Choice";
				definition = "Choice of formats for the price.";
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getRate() {
		return rate;
	}

	public PriceRateOrAmountOrUnknown3Choice setRate(PercentageRate rate) {
		this.rate = Objects.requireNonNull(rate);
		return this;
	}

	public RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount getAmount() {
		return amount;
	}

	public PriceRateOrAmountOrUnknown3Choice setAmount(RestrictedFINActiveOrHistoricCurrencyAnd13DecimalAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public YesNoIndicator getUnknownIndicator() {
		return unknownIndicator;
	}

	public PriceRateOrAmountOrUnknown3Choice setUnknownIndicator(YesNoIndicator unknownIndicator) {
		this.unknownIndicator = Objects.requireNonNull(unknownIndicator);
		return this;
	}
}