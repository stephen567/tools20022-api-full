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
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.ValuationStatistics;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Statistical data related to the price change of a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3#mmCurrency
 * ValuationStatistics3.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3#mmPriceTypeChangeBasis
 * ValuationStatistics3.mmPriceTypeChangeBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3#mmPriceChange
 * ValuationStatistics3.mmPriceChange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ValuationStatistics3#mmYield
 * ValuationStatistics3.mmYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3#mmByPredefinedTimePeriods
 * ValuationStatistics3.mmByPredefinedTimePeriods}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3#mmByUserDefinedTimePeriod
 * ValuationStatistics3.mmByUserDefinedTimePeriod}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
 * ValuationStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyPriceChangeRule#forValuationStatistics3
 * ConstraintCurrencyPriceChangeRule.forValuationStatistics3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyPredefinedPeriodsRule#forValuationStatistics3
 * ConstraintCurrencyPredefinedPeriodsRule.forValuationStatistics3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCurrencyUserDefinedPeriodsRule#forValuationStatistics3
 * ConstraintCurrencyUserDefinedPeriodsRule.forValuationStatistics3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ValuationStatistics3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Statistical data related to the price change of a security."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ValuationStatistics3", propOrder = {"currency", "priceTypeChangeBasis", "priceChange", "yield", "byPredefinedTimePeriods", "byUserDefinedTimePeriod"})
public class ValuationStatistics3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ccy", required = true)
	protected ActiveOrHistoricCurrencyCode currency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmCurrency
	 * ValuationStatistics.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3
	 * ValuationStatistics3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency of the valuation statistics."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationStatistics3.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency of the valuation statistics.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "PricTpChngBsis", required = true)
	protected PriceType2 priceTypeChangeBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceType2
	 * PriceType2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPriceTypeChangeBasis
	 * ValuationStatistics.mmPriceTypeChangeBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3
	 * ValuationStatistics3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricTpChngBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceTypeChangeBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of price from which the change is calculated, eg, bid, offer, or single."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceTypeChangeBasis = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmPriceTypeChangeBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationStatistics3.mmObject();
			isDerived = false;
			xmlTag = "PricTpChngBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceTypeChangeBasis";
			definition = "Type of price from which the change is calculated, eg, bid, offer, or single.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PriceType2.mmObject();
		}
	};
	@XmlElement(name = "PricChng", required = true)
	protected PriceValueChange1 priceChange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PriceValueChange1
	 * PriceValueChange1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPriceChange
	 * ValuationStatistics.mmPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3
	 * ValuationStatistics3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricChng"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Change in price since the previous valuation date."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriceChange = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmPriceChange;
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationStatistics3.mmObject();
			isDerived = false;
			xmlTag = "PricChng";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceChange";
			definition = "Change in price since the previous valuation date.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.PriceValueChange1.mmObject();
		}
	};
	@XmlElement(name = "Yld")
	protected PercentageRate yield;
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
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmYield
	 * ValuationStatistics.mmYield}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3
	 * ValuationStatistics3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Yld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of income from the financial instrument, usually calculated as total dividends or coupon interest available to investors in the last year,divided by the current price."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmYield = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ValuationStatistics.mmYield;
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationStatistics3.mmObject();
			isDerived = false;
			xmlTag = "Yld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yield";
			definition = "Rate of income from the financial instrument, usually calculated as total dividends or coupon interest available to investors in the last year,divided by the current price.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "ByPrdfndTmPrds")
	protected StatisticsByPredefinedTimePeriods2 byPredefinedTimePeriods;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2
	 * StatisticsByPredefinedTimePeriods2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3
	 * ValuationStatistics3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ByPrdfndTmPrds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ByPredefinedTimePeriods"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to price variations, expressed using pre-defined periods."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmByPredefinedTimePeriods = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationStatistics3.mmObject();
			isDerived = false;
			xmlTag = "ByPrdfndTmPrds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ByPredefinedTimePeriods";
			definition = "Information related to price variations, expressed using pre-defined periods.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2.mmObject();
		}
	};
	@XmlElement(name = "ByUsrDfndTmPrd")
	protected List<com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2> byUserDefinedTimePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2
	 * StatisticsByUserDefinedTimePeriod2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ValuationStatistics3
	 * ValuationStatistics3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ByUsrDfndTmPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ByUserDefinedTimePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to price variations, expressed using user-defined periods."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmByUserDefinedTimePeriod = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ValuationStatistics3.mmObject();
			isDerived = false;
			xmlTag = "ByUsrDfndTmPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ByUserDefinedTimePeriod";
			definition = "Information related to price variations, expressed using user-defined periods.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ValuationStatistics3.mmCurrency, com.tools20022.repository.msg.ValuationStatistics3.mmPriceTypeChangeBasis,
						com.tools20022.repository.msg.ValuationStatistics3.mmPriceChange, com.tools20022.repository.msg.ValuationStatistics3.mmYield, com.tools20022.repository.msg.ValuationStatistics3.mmByPredefinedTimePeriods,
						com.tools20022.repository.msg.ValuationStatistics3.mmByUserDefinedTimePeriod);
				trace_lazy = () -> ValuationStatistics.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCurrencyPriceChangeRule.forValuationStatistics3,
						com.tools20022.repository.constraints.ConstraintCurrencyPredefinedPeriodsRule.forValuationStatistics3, com.tools20022.repository.constraints.ConstraintCurrencyUserDefinedPeriodsRule.forValuationStatistics3);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ValuationStatistics3";
				definition = "Statistical data related to the price change of a security.";
			}
		});
		return mmObject_lazy.get();
	}

	public ActiveOrHistoricCurrencyCode getCurrency() {
		return currency;
	}

	public ValuationStatistics3 setCurrency(ActiveOrHistoricCurrencyCode currency) {
		this.currency = Objects.requireNonNull(currency);
		return this;
	}

	public PriceType2 getPriceTypeChangeBasis() {
		return priceTypeChangeBasis;
	}

	public ValuationStatistics3 setPriceTypeChangeBasis(com.tools20022.repository.msg.PriceType2 priceTypeChangeBasis) {
		this.priceTypeChangeBasis = Objects.requireNonNull(priceTypeChangeBasis);
		return this;
	}

	public PriceValueChange1 getPriceChange() {
		return priceChange;
	}

	public ValuationStatistics3 setPriceChange(com.tools20022.repository.msg.PriceValueChange1 priceChange) {
		this.priceChange = Objects.requireNonNull(priceChange);
		return this;
	}

	public Optional<PercentageRate> getYield() {
		return yield == null ? Optional.empty() : Optional.of(yield);
	}

	public ValuationStatistics3 setYield(PercentageRate yield) {
		this.yield = yield;
		return this;
	}

	public Optional<StatisticsByPredefinedTimePeriods2> getByPredefinedTimePeriods() {
		return byPredefinedTimePeriods == null ? Optional.empty() : Optional.of(byPredefinedTimePeriods);
	}

	public ValuationStatistics3 setByPredefinedTimePeriods(com.tools20022.repository.msg.StatisticsByPredefinedTimePeriods2 byPredefinedTimePeriods) {
		this.byPredefinedTimePeriods = byPredefinedTimePeriods;
		return this;
	}

	public List<StatisticsByUserDefinedTimePeriod2> getByUserDefinedTimePeriod() {
		return byUserDefinedTimePeriod == null ? byUserDefinedTimePeriod = new ArrayList<>() : byUserDefinedTimePeriod;
	}

	public ValuationStatistics3 setByUserDefinedTimePeriod(List<com.tools20022.repository.msg.StatisticsByUserDefinedTimePeriod2> byUserDefinedTimePeriod) {
		this.byUserDefinedTimePeriod = Objects.requireNonNull(byUserDefinedTimePeriod);
		return this;
	}
}