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
import com.tools20022.repository.choice.MarginResult1Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.ExposureCalculation;
import com.tools20022.repository.entity.ExposureTerm;
import com.tools20022.repository.entity.MarginCall;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Amount2;
import com.tools20022.repository.msg.Collateral3;
import com.tools20022.repository.msg.SecurityIdentification14;
import com.tools20022.repository.msg.VariationMargin2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the calculation of the margin.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Margin2#mmFinancialInstrumentIdentification
 * Margin2.mmFinancialInstrumentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Margin2#mmExposureAmount
 * Margin2.mmExposureAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Margin2#mmTotalMarginAmount
 * Margin2.mmTotalMarginAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Margin2#mmVariationMargin
 * Margin2.mmVariationMargin}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Margin2#mmInitialMargin
 * Margin2.mmInitialMargin}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Margin2#mmIncreaseCoverage
 * Margin2.mmIncreaseCoverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Margin2#mmMinimumRequirementDeposit
 * Margin2.mmMinimumRequirementDeposit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Margin2#mmCollateralOnDeposit
 * Margin2.mmCollateralOnDeposit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Margin2#mmMarginResult
 * Margin2.mmMarginResult}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MarginCall MarginCall}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Margin2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details on the calculation of the margin."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Margin2", propOrder = {"financialInstrumentIdentification", "exposureAmount", "totalMarginAmount", "variationMargin", "initialMargin", "increaseCoverage", "minimumRequirementDeposit", "collateralOnDeposit", "marginResult"})
public class Margin2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinInstrmId")
	protected SecurityIdentification14 financialInstrumentIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification14
	 * SecurityIdentification14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmIdentification
	 * Security.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Margin2
	 * Margin2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the security identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Margin2, Optional<SecurityIdentification14>> mmFinancialInstrumentIdentification = new MMMessageAssociationEnd<Margin2, Optional<SecurityIdentification14>>() {
		{
			businessElementTrace_lazy = () -> Security.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Margin2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentIdentification";
			definition = "Provides details about the security identification.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecurityIdentification14.mmObject();
		}

		@Override
		public Optional<SecurityIdentification14> getValue(Margin2 obj) {
			return obj.getFinancialInstrumentIdentification();
		}

		@Override
		public void setValue(Margin2 obj, Optional<SecurityIdentification14> value) {
			obj.setFinancialInstrumentIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "XpsrAmt")
	protected Amount2 exposureAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Amount2 Amount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalExposedAmount
	 * ExposureCalculation.mmTotalExposedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Margin2
	 * Margin2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XpsrAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExposureAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net total of the transaction exposure of all outstanding deals."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Margin2, Optional<Amount2>> mmExposureAmount = new MMMessageAssociationEnd<Margin2, Optional<Amount2>>() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalExposedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Margin2.mmObject();
			isDerived = false;
			xmlTag = "XpsrAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExposureAmount";
			definition = "Net total of the transaction exposure of all outstanding deals.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Amount2.mmObject();
		}

		@Override
		public Optional<Amount2> getValue(Margin2 obj) {
			return obj.getExposureAmount();
		}

		@Override
		public void setValue(Margin2 obj, Optional<Amount2> value) {
			obj.setExposureAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlMrgnAmt", required = true)
	protected ActiveCurrencyAndAmount totalMarginAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmTotalMarginAmount
	 * MarginCall.mmTotalMarginAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Margin2
	 * Margin2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlMrgnAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalMarginAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total margin requirement (expressed in the reporting currency) that must be provided by the clearing member to the central counterparty. This is the total requirement calculated to cover the initial margin and the variation margin."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Margin2, ActiveCurrencyAndAmount> mmTotalMarginAmount = new MMMessageAttribute<Margin2, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmTotalMarginAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Margin2.mmObject();
			isDerived = false;
			xmlTag = "TtlMrgnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalMarginAmount";
			definition = "Total margin requirement (expressed in the reporting currency) that must be provided by the clearing member to the central counterparty. This is the total requirement calculated to cover the initial margin and the variation margin.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(Margin2 obj) {
			return obj.getTotalMarginAmount();
		}

		@Override
		public void setValue(Margin2 obj, ActiveCurrencyAndAmount value) {
			obj.setTotalMarginAmount(value);
		}
	};
	@XmlElement(name = "VartnMrgn", required = true)
	protected VariationMargin2 variationMargin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.VariationMargin2
	 * VariationMargin2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmVariationMargin
	 * MarginCall.mmVariationMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Margin2
	 * Margin2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VartnMrgn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariationMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the calculation of the variation margin."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Margin2, VariationMargin2> mmVariationMargin = new MMMessageAssociationEnd<Margin2, VariationMargin2>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmVariationMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.Margin2.mmObject();
			isDerived = false;
			xmlTag = "VartnMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariationMargin";
			definition = "Provides details on the calculation of the variation margin.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> VariationMargin2.mmObject();
		}

		@Override
		public VariationMargin2 getValue(Margin2 obj) {
			return obj.getVariationMargin();
		}

		@Override
		public void setValue(Margin2 obj, VariationMargin2 value) {
			obj.setVariationMargin(value);
		}
	};
	@XmlElement(name = "InitlMrgn", required = true)
	protected Amount2 initialMargin;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Amount2 Amount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmInitialMargin
	 * MarginCall.mmInitialMargin}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Margin2
	 * Margin2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlMrgn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialMargin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Margin required for absorbing future market price fluctuations (market risks) occurring between the default of a member and close-out of unsettled securities positions by the central counterparty."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Margin2, Amount2> mmInitialMargin = new MMMessageAssociationEnd<Margin2, Amount2>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmInitialMargin;
			componentContext_lazy = () -> com.tools20022.repository.msg.Margin2.mmObject();
			isDerived = false;
			xmlTag = "InitlMrgn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialMargin";
			definition = "Margin required for absorbing future market price fluctuations (market risks) occurring between the default of a member and close-out of unsettled securities positions by the central counterparty.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Amount2.mmObject();
		}

		@Override
		public Amount2 getValue(Margin2 obj) {
			return obj.getInitialMargin();
		}

		@Override
		public void setValue(Margin2 obj, Amount2 value) {
			obj.setInitialMargin(value);
		}
	};
	@XmlElement(name = "IncrCvrg")
	protected ActiveCurrencyAndAmount increaseCoverage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmIncreaseCoverage
	 * MarginCall.mmIncreaseCoverage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Margin2
	 * Margin2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncrCvrg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseCoverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional amount (expressed in the reporting currency) that the clearing member will have to provide to cover a risk increase. This results from a risk management decision depending on Central counterparty specific criteria."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Margin2, Optional<ActiveCurrencyAndAmount>> mmIncreaseCoverage = new MMMessageAttribute<Margin2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmIncreaseCoverage;
			componentContext_lazy = () -> com.tools20022.repository.msg.Margin2.mmObject();
			isDerived = false;
			xmlTag = "IncrCvrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseCoverage";
			definition = "Additional amount (expressed in the reporting currency) that the clearing member will have to provide to cover a risk increase. This results from a risk management decision depending on Central counterparty specific criteria.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(Margin2 obj) {
			return obj.getIncreaseCoverage();
		}

		@Override
		public void setValue(Margin2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setIncreaseCoverage(value.orElse(null));
		}
	};
	@XmlElement(name = "MinRqrmntDpst")
	protected ActiveCurrencyAndAmount minimumRequirementDeposit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureTerm#mmMinimumRequirementDeposit
	 * ExposureTerm.mmMinimumRequirementDeposit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Margin2
	 * Margin2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MinRqrmntDpst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumRequirementDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum requirement (expressed in the reporting currency) for a participant if their requirement falls below a specific amount set by the Central counterparty."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Margin2, Optional<ActiveCurrencyAndAmount>> mmMinimumRequirementDeposit = new MMMessageAttribute<Margin2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> ExposureTerm.mmMinimumRequirementDeposit;
			componentContext_lazy = () -> com.tools20022.repository.msg.Margin2.mmObject();
			isDerived = false;
			xmlTag = "MinRqrmntDpst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumRequirementDeposit";
			definition = "Minimum requirement (expressed in the reporting currency) for a participant if their requirement falls below a specific amount set by the Central counterparty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(Margin2 obj) {
			return obj.getMinimumRequirementDeposit();
		}

		@Override
		public void setValue(Margin2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setMinimumRequirementDeposit(value.orElse(null));
		}
	};
	@XmlElement(name = "CollOnDpst")
	protected Collateral3 collateralOnDeposit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Collateral3
	 * Collateral3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ExposureCalculation#mmTotalCollateralCurrentValue
	 * ExposureCalculation.mmTotalCollateralCurrentValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Margin2
	 * Margin2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollOnDpst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOnDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the valuation of the collateral on deposit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Margin2, Optional<Collateral3>> mmCollateralOnDeposit = new MMMessageAssociationEnd<Margin2, Optional<Collateral3>>() {
		{
			businessElementTrace_lazy = () -> ExposureCalculation.mmTotalCollateralCurrentValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.Margin2.mmObject();
			isDerived = false;
			xmlTag = "CollOnDpst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOnDeposit";
			definition = "Provides details on the valuation of the collateral on deposit.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Collateral3.mmObject();
		}

		@Override
		public Optional<Collateral3> getValue(Margin2 obj) {
			return obj.getCollateralOnDeposit();
		}

		@Override
		public void setValue(Margin2 obj, Optional<Collateral3> value) {
			obj.setCollateralOnDeposit(value.orElse(null));
		}
	};
	@XmlElement(name = "MrgnRslt")
	protected MarginResult1Choice marginResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.MarginResult1Choice
	 * MarginResult1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MarginCall#mmCollateralMovement
	 * MarginCall.mmCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Margin2
	 * Margin2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MrgnRslt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarginResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the margin result."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Margin2, Optional<MarginResult1Choice>> mmMarginResult = new MMMessageAssociationEnd<Margin2, Optional<MarginResult1Choice>>() {
		{
			businessElementTrace_lazy = () -> MarginCall.mmCollateralMovement;
			componentContext_lazy = () -> com.tools20022.repository.msg.Margin2.mmObject();
			isDerived = false;
			xmlTag = "MrgnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarginResult";
			definition = "Provides details on the margin result.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarginResult1Choice.mmObject();
		}

		@Override
		public Optional<MarginResult1Choice> getValue(Margin2 obj) {
			return obj.getMarginResult();
		}

		@Override
		public void setValue(Margin2 obj, Optional<MarginResult1Choice> value) {
			obj.setMarginResult(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Margin2.mmFinancialInstrumentIdentification, com.tools20022.repository.msg.Margin2.mmExposureAmount,
						com.tools20022.repository.msg.Margin2.mmTotalMarginAmount, com.tools20022.repository.msg.Margin2.mmVariationMargin, com.tools20022.repository.msg.Margin2.mmInitialMargin,
						com.tools20022.repository.msg.Margin2.mmIncreaseCoverage, com.tools20022.repository.msg.Margin2.mmMinimumRequirementDeposit, com.tools20022.repository.msg.Margin2.mmCollateralOnDeposit,
						com.tools20022.repository.msg.Margin2.mmMarginResult);
				trace_lazy = () -> MarginCall.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Margin2";
				definition = "Provides details on the calculation of the margin.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<SecurityIdentification14> getFinancialInstrumentIdentification() {
		return financialInstrumentIdentification == null ? Optional.empty() : Optional.of(financialInstrumentIdentification);
	}

	public Margin2 setFinancialInstrumentIdentification(SecurityIdentification14 financialInstrumentIdentification) {
		this.financialInstrumentIdentification = financialInstrumentIdentification;
		return this;
	}

	public Optional<Amount2> getExposureAmount() {
		return exposureAmount == null ? Optional.empty() : Optional.of(exposureAmount);
	}

	public Margin2 setExposureAmount(Amount2 exposureAmount) {
		this.exposureAmount = exposureAmount;
		return this;
	}

	public ActiveCurrencyAndAmount getTotalMarginAmount() {
		return totalMarginAmount;
	}

	public Margin2 setTotalMarginAmount(ActiveCurrencyAndAmount totalMarginAmount) {
		this.totalMarginAmount = Objects.requireNonNull(totalMarginAmount);
		return this;
	}

	public VariationMargin2 getVariationMargin() {
		return variationMargin;
	}

	public Margin2 setVariationMargin(VariationMargin2 variationMargin) {
		this.variationMargin = Objects.requireNonNull(variationMargin);
		return this;
	}

	public Amount2 getInitialMargin() {
		return initialMargin;
	}

	public Margin2 setInitialMargin(Amount2 initialMargin) {
		this.initialMargin = Objects.requireNonNull(initialMargin);
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getIncreaseCoverage() {
		return increaseCoverage == null ? Optional.empty() : Optional.of(increaseCoverage);
	}

	public Margin2 setIncreaseCoverage(ActiveCurrencyAndAmount increaseCoverage) {
		this.increaseCoverage = increaseCoverage;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getMinimumRequirementDeposit() {
		return minimumRequirementDeposit == null ? Optional.empty() : Optional.of(minimumRequirementDeposit);
	}

	public Margin2 setMinimumRequirementDeposit(ActiveCurrencyAndAmount minimumRequirementDeposit) {
		this.minimumRequirementDeposit = minimumRequirementDeposit;
		return this;
	}

	public Optional<Collateral3> getCollateralOnDeposit() {
		return collateralOnDeposit == null ? Optional.empty() : Optional.of(collateralOnDeposit);
	}

	public Margin2 setCollateralOnDeposit(Collateral3 collateralOnDeposit) {
		this.collateralOnDeposit = collateralOnDeposit;
		return this;
	}

	public Optional<MarginResult1Choice> getMarginResult() {
		return marginResult == null ? Optional.empty() : Optional.of(marginResult);
	}

	public Margin2 setMarginResult(MarginResult1Choice marginResult) {
		this.marginResult = marginResult;
		return this;
	}
}