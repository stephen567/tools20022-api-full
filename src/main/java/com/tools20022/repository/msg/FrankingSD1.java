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
import com.tools20022.repository.codeset.FrankingClass1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Franking details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.FrankingSD1#mmPlaceAndName
 * FrankingSD1.mmPlaceAndName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FrankingSD1#mmFrankingClass
 * FrankingSD1.mmFrankingClass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FrankingSD1#mmFullyFrankedIndicator
 * FrankingSD1.mmFullyFrankedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FrankingSD1#mmFrankedPercentage
 * FrankingSD1.mmFrankedPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FrankingSD1#mmUnfrankedPercentage
 * FrankingSD1.mmUnfrankedPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FrankingSD1#mmCorporateTaxRateForFrankingCredit
 * FrankingSD1.mmCorporateTaxRateForFrankingCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FrankingSD1#mmFrankedAmountPerSecurity
 * FrankingSD1.mmFrankedAmountPerSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FrankingSD1#mmUnfrankedAmountPerSecurity
 * FrankingSD1.mmUnfrankedAmountPerSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FrankingSD1#mmConduitForeignIncomeAmount
 * FrankingSD1.mmConduitForeignIncomeAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FrankingSD1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Franking details."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FrankingSD1", propOrder = {"placeAndName", "frankingClass", "fullyFrankedIndicator", "frankedPercentage", "unfrankedPercentage", "corporateTaxRateForFrankingCredit", "frankedAmountPerSecurity",
		"unfrankedAmountPerSecurity", "conduitForeignIncomeAmount"})
public class FrankingSD1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous reference to the location where the supplementary data must be inserted in the message instance."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FrankingSD1, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<FrankingSD1, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(FrankingSD1 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(FrankingSD1 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
		}
	};
	@XmlElement(name = "FrnkgClss", required = true)
	protected FrankingClass1Code frankingClass;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.FrankingClass1Code
	 * FrankingClass1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrnkgClss"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrankingClass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend / Distribution kind where the franking information apples to."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FrankingSD1, FrankingClass1Code> mmFrankingClass = new MMMessageAttribute<FrankingSD1, FrankingClass1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "FrnkgClss";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrankingClass";
			definition = "Dividend / Distribution kind where the franking information apples to.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> FrankingClass1Code.mmObject();
		}

		@Override
		public FrankingClass1Code getValue(FrankingSD1 obj) {
			return obj.getFrankingClass();
		}

		@Override
		public void setValue(FrankingSD1 obj, FrankingClass1Code value) {
			obj.setFrankingClass(value);
		}
	};
	@XmlElement(name = "FullyFrnkdInd")
	protected YesNoIndicator fullyFrankedIndicator;
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
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullyFrnkdInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFrankedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicator if the dividend is fully franked."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FrankingSD1, Optional<YesNoIndicator>> mmFullyFrankedIndicator = new MMMessageAttribute<FrankingSD1, Optional<YesNoIndicator>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "FullyFrnkdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyFrankedIndicator";
			definition = "Indicator if the dividend is fully franked.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(FrankingSD1 obj) {
			return obj.getFullyFrankedIndicator();
		}

		@Override
		public void setValue(FrankingSD1 obj, Optional<YesNoIndicator> value) {
			obj.setFullyFrankedIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "FrnkdPctg")
	protected PercentageRate frankedPercentage;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrnkdPctg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrankedPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of dividend that is franked."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FrankingSD1, Optional<PercentageRate>> mmFrankedPercentage = new MMMessageAttribute<FrankingSD1, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "FrnkdPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrankedPercentage";
			definition = "Percentage of dividend that is franked.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(FrankingSD1 obj) {
			return obj.getFrankedPercentage();
		}

		@Override
		public void setValue(FrankingSD1 obj, Optional<PercentageRate> value) {
			obj.setFrankedPercentage(value.orElse(null));
		}
	};
	@XmlElement(name = "UfrnkdPctg")
	protected PercentageRate unfrankedPercentage;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UfrnkdPctg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnfrankedPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of dividend that is unfranked."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FrankingSD1, Optional<PercentageRate>> mmUnfrankedPercentage = new MMMessageAttribute<FrankingSD1, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "UfrnkdPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnfrankedPercentage";
			definition = "Percentage of dividend that is unfranked.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(FrankingSD1 obj) {
			return obj.getUnfrankedPercentage();
		}

		@Override
		public void setValue(FrankingSD1 obj, Optional<PercentageRate> value) {
			obj.setUnfrankedPercentage(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpTaxRateForFrnkgCdt")
	protected PercentageRate corporateTaxRateForFrankingCredit;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpTaxRateForFrnkgCdt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateTaxRateForFrankingCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The corporate tax rate for the for franking credit of the dividend.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FrankingSD1, Optional<PercentageRate>> mmCorporateTaxRateForFrankingCredit = new MMMessageAttribute<FrankingSD1, Optional<PercentageRate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "CorpTaxRateForFrnkgCdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateTaxRateForFrankingCredit";
			definition = "The corporate tax rate for the for franking credit of the dividend.\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(FrankingSD1 obj) {
			return obj.getCorporateTaxRateForFrankingCredit();
		}

		@Override
		public void setValue(FrankingSD1 obj, Optional<PercentageRate> value) {
			obj.setCorporateTaxRateForFrankingCredit(value.orElse(null));
		}
	};
	@XmlElement(name = "FrnkdAmtPerScty")
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount frankedAmountPerSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount
	 * RestrictedFINActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrnkdAmtPerScty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrankedAmountPerSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cents amount of the dividend which has been franked at 30%."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FrankingSD1, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount>> mmFrankedAmountPerSecurity = new MMMessageAttribute<FrankingSD1, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "FrnkdAmtPerScty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrankedAmountPerSecurity";
			definition = "Cents amount of the dividend which has been franked at 30%.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> getValue(FrankingSD1 obj) {
			return obj.getFrankedAmountPerSecurity();
		}

		@Override
		public void setValue(FrankingSD1 obj, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> value) {
			obj.setFrankedAmountPerSecurity(value.orElse(null));
		}
	};
	@XmlElement(name = "UfrnkdAmtPerScty")
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount unfrankedAmountPerSecurity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount
	 * RestrictedFINActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UfrnkdAmtPerScty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnfrankedAmountPerSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of the dividend which has been unfranked.\r\r\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FrankingSD1, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount>> mmUnfrankedAmountPerSecurity = new MMMessageAttribute<FrankingSD1, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "UfrnkdAmtPerScty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnfrankedAmountPerSecurity";
			definition = "Amount of the dividend which has been unfranked.\r\r\n";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> getValue(FrankingSD1 obj) {
			return obj.getUnfrankedAmountPerSecurity();
		}

		@Override
		public void setValue(FrankingSD1 obj, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> value) {
			obj.setUnfrankedAmountPerSecurity(value.orElse(null));
		}
	};
	@XmlElement(name = "CndtFrgnIncmAmt")
	protected RestrictedFINActiveCurrencyAnd13DecimalAmount conduitForeignIncomeAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINActiveCurrencyAnd13DecimalAmount
	 * RestrictedFINActiveCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FrankingSD1 FrankingSD1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CndtFrgnIncmAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConduitForeignIncomeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conduit foreign income (CFI) amount related to the corporate action."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FrankingSD1, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount>> mmConduitForeignIncomeAmount = new MMMessageAttribute<FrankingSD1, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FrankingSD1.mmObject();
			isDerived = false;
			xmlTag = "CndtFrgnIncmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConduitForeignIncomeAmount";
			definition = "Conduit foreign income (CFI) amount related to the corporate action.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINActiveCurrencyAnd13DecimalAmount.mmObject();
		}

		@Override
		public Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> getValue(FrankingSD1 obj) {
			return obj.getConduitForeignIncomeAmount();
		}

		@Override
		public void setValue(FrankingSD1 obj, Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> value) {
			obj.setConduitForeignIncomeAmount(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FrankingSD1.mmPlaceAndName, com.tools20022.repository.msg.FrankingSD1.mmFrankingClass,
						com.tools20022.repository.msg.FrankingSD1.mmFullyFrankedIndicator, com.tools20022.repository.msg.FrankingSD1.mmFrankedPercentage, com.tools20022.repository.msg.FrankingSD1.mmUnfrankedPercentage,
						com.tools20022.repository.msg.FrankingSD1.mmCorporateTaxRateForFrankingCredit, com.tools20022.repository.msg.FrankingSD1.mmFrankedAmountPerSecurity,
						com.tools20022.repository.msg.FrankingSD1.mmUnfrankedAmountPerSecurity, com.tools20022.repository.msg.FrankingSD1.mmConduitForeignIncomeAmount);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FrankingSD1";
				definition = "Franking details.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public FrankingSD1 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public FrankingClass1Code getFrankingClass() {
		return frankingClass;
	}

	public FrankingSD1 setFrankingClass(FrankingClass1Code frankingClass) {
		this.frankingClass = Objects.requireNonNull(frankingClass);
		return this;
	}

	public Optional<YesNoIndicator> getFullyFrankedIndicator() {
		return fullyFrankedIndicator == null ? Optional.empty() : Optional.of(fullyFrankedIndicator);
	}

	public FrankingSD1 setFullyFrankedIndicator(YesNoIndicator fullyFrankedIndicator) {
		this.fullyFrankedIndicator = fullyFrankedIndicator;
		return this;
	}

	public Optional<PercentageRate> getFrankedPercentage() {
		return frankedPercentage == null ? Optional.empty() : Optional.of(frankedPercentage);
	}

	public FrankingSD1 setFrankedPercentage(PercentageRate frankedPercentage) {
		this.frankedPercentage = frankedPercentage;
		return this;
	}

	public Optional<PercentageRate> getUnfrankedPercentage() {
		return unfrankedPercentage == null ? Optional.empty() : Optional.of(unfrankedPercentage);
	}

	public FrankingSD1 setUnfrankedPercentage(PercentageRate unfrankedPercentage) {
		this.unfrankedPercentage = unfrankedPercentage;
		return this;
	}

	public Optional<PercentageRate> getCorporateTaxRateForFrankingCredit() {
		return corporateTaxRateForFrankingCredit == null ? Optional.empty() : Optional.of(corporateTaxRateForFrankingCredit);
	}

	public FrankingSD1 setCorporateTaxRateForFrankingCredit(PercentageRate corporateTaxRateForFrankingCredit) {
		this.corporateTaxRateForFrankingCredit = corporateTaxRateForFrankingCredit;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> getFrankedAmountPerSecurity() {
		return frankedAmountPerSecurity == null ? Optional.empty() : Optional.of(frankedAmountPerSecurity);
	}

	public FrankingSD1 setFrankedAmountPerSecurity(RestrictedFINActiveCurrencyAnd13DecimalAmount frankedAmountPerSecurity) {
		this.frankedAmountPerSecurity = frankedAmountPerSecurity;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> getUnfrankedAmountPerSecurity() {
		return unfrankedAmountPerSecurity == null ? Optional.empty() : Optional.of(unfrankedAmountPerSecurity);
	}

	public FrankingSD1 setUnfrankedAmountPerSecurity(RestrictedFINActiveCurrencyAnd13DecimalAmount unfrankedAmountPerSecurity) {
		this.unfrankedAmountPerSecurity = unfrankedAmountPerSecurity;
		return this;
	}

	public Optional<RestrictedFINActiveCurrencyAnd13DecimalAmount> getConduitForeignIncomeAmount() {
		return conduitForeignIncomeAmount == null ? Optional.empty() : Optional.of(conduitForeignIncomeAmount);
	}

	public FrankingSD1 setConduitForeignIncomeAmount(RestrictedFINActiveCurrencyAnd13DecimalAmount conduitForeignIncomeAmount) {
		this.conduitForeignIncomeAmount = conduitForeignIncomeAmount;
		return this;
	}
}