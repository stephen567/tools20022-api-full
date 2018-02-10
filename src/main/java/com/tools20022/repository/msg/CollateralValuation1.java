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
import com.tools20022.repository.codeset.CollateralType1Code;
import com.tools20022.repository.codeset.InterestComputationMethod2Code;
import com.tools20022.repository.codeset.SettlementStatus2Code;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
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
 * Provides details about the valuation of each piece of collateral that is
 * posted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmCollateralReference
 * CollateralValuation1.mmCollateralReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmCollateralType
 * CollateralValuation1.mmCollateralType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmSettlementStatus
 * CollateralValuation1.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmNumberOfDaysAccrued
 * CollateralValuation1.mmNumberOfDaysAccrued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmAmountDetails
 * CollateralValuation1.mmAmountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmDayCountBasis
 * CollateralValuation1.mmDayCountBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmExchangeRate
 * CollateralValuation1.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmCurrencyHaircut
 * CollateralValuation1.mmCurrencyHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmAdjustedRate
 * CollateralValuation1.mmAdjustedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmSecuritiesCollateralDetails
 * CollateralValuation1.mmSecuritiesCollateralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmCashCollateralDetails
 * CollateralValuation1.mmCashCollateralDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralValuation1#mmOtherCollateralDetails
 * CollateralValuation1.mmOtherCollateralDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralValuation
 * CollateralValuation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralValuation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the valuation of each piece of collateral that is posted."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CollateralValuation2
 * CollateralValuation2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralValuation1", propOrder = {"collateralReference", "collateralType", "settlementStatus", "numberOfDaysAccrued", "amountDetails", "dayCountBasis", "exchangeRate", "currencyHaircut", "adjustedRate",
		"securitiesCollateralDetails", "cashCollateralDetails", "otherCollateralDetails"})
public class CollateralValuation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CollRef", required = true)
	protected Max35Text collateralReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1
	 * CollateralValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference of the piece of valued collateral."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmCollateralIdentification
	 * CollateralValuation2.mmCollateralIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation1.mmObject();
			isDerived = false;
			xmlTag = "CollRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralReference";
			definition = "Reference of the piece of valued collateral.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation2.mmCollateralIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "CollTp", required = true)
	protected CollateralType1Code collateralType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralType1Code
	 * CollateralType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralType
	 * Collateral.mmCollateralType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1
	 * CollateralValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of collateral used."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmCollateralType
	 * CollateralValuation2.mmCollateralType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation1.mmObject();
			isDerived = false;
			xmlTag = "CollTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralType";
			definition = "Specifies the type of collateral used.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation2.mmCollateralType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralType1Code.mmObject();
		}
	};
	@XmlElement(name = "SttlmSts", required = true)
	protected SettlementStatus2Code settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementStatus2Code
	 * SettlementStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmSettlement
	 * CollateralStatus.mmSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1
	 * CollateralValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of settlement of an instruction/financial instrument movement."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmSettlementStatus
	 * CollateralValuation2.mmSettlementStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralStatus.mmSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation1.mmObject();
			isDerived = false;
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of an instruction/financial instrument movement.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation2.mmSettlementStatus);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> SettlementStatus2Code.mmObject();
		}
	};
	@XmlElement(name = "NbOfDaysAcrd", required = true)
	protected Number numberOfDaysAccrued;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmNumberOfDays
	 * DateTimePeriod.mmNumberOfDays}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1
	 * CollateralValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfDaysAcrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfDaysAccrued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the number of days used for interest calculation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmNumberOfDaysAccrued
	 * CollateralValuation2.mmNumberOfDaysAccrued}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfDaysAccrued = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> DateTimePeriod.mmNumberOfDays;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation1.mmObject();
			isDerived = false;
			xmlTag = "NbOfDaysAcrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfDaysAccrued";
			definition = "Specifies the number of days used for interest calculation.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation2.mmNumberOfDaysAccrued);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	@XmlElement(name = "AmtDtls", required = true)
	protected CollateralAmount1 amountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralAmount1
	 * CollateralAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateral
	 * CollateralValuation.mmCollateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1
	 * CollateralValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the collateral valuation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmValuationAmounts
	 * CollateralValuation2.mmValuationAmounts}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CollateralValuation.mmCollateral;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation1.mmObject();
			isDerived = false;
			xmlTag = "AmtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountDetails";
			definition = "Provides details on the collateral valuation.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation2.mmValuationAmounts);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CollateralAmount1.mmObject();
		}
	};
	@XmlElement(name = "DayCntBsis", required = true)
	protected InterestComputationMethod2Code dayCountBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
	 * InterestCalculation.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1
	 * CollateralValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DayCntBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayCountBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the computation method of (accrued) interest of the security."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmDayCountBasis
	 * CollateralValuation2.mmDayCountBasis}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDayCountBasis = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation1.mmObject();
			isDerived = false;
			xmlTag = "DayCntBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayCountBasis";
			definition = "Specifies the computation method of (accrued) interest of the security.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation2.mmDayCountBasis);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestComputationMethod2Code.mmObject();
		}
	};
	@XmlElement(name = "XchgRate")
	protected BaseOneRate exchangeRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmExchangeRate
	 * CurrencyExchange.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1
	 * CollateralValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the exchange rate between the currency of the collateral and the reporting currency."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmExchangeRate
	 * CollateralValuation2.mmExchangeRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation1.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Specifies the exchange rate between the currency of the collateral and the reporting currency.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation2.mmExchangeRate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	@XmlElement(name = "CcyHrcut")
	protected BaseOneRate currencyHaircut;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.HaircutValuation#mmHaircut
	 * HaircutValuation.mmHaircut}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1
	 * CollateralValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyHrcut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyHaircut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the haircut or valuation factor on the currency of the collateral expressed as a percentage."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmCurrencyHaircut
	 * CollateralValuation2.mmCurrencyHaircut}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrencyHaircut = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> HaircutValuation.mmHaircut;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation1.mmObject();
			isDerived = false;
			xmlTag = "CcyHrcut";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyHaircut";
			definition = "Specifies the haircut or valuation factor on the currency of the collateral expressed as a percentage.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation2.mmCurrencyHaircut);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	@XmlElement(name = "AdjstdRate")
	protected BaseOneRate adjustedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmAdjustedRate
	 * CollateralValuation.mmAdjustedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1
	 * CollateralValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdjstdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage by which the collateral amount needs to be adjusted."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmAdjustedRate
	 * CollateralValuation2.mmAdjustedRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdjustedRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CollateralValuation.mmAdjustedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation1.mmObject();
			isDerived = false;
			xmlTag = "AdjstdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustedRate";
			definition = "Percentage by which the collateral amount needs to be adjusted.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation2.mmAdjustedRate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	@XmlElement(name = "SctiesCollDtls")
	protected SecuritiesCollateral1 securitiesCollateralDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesCollateral1
	 * SecuritiesCollateral1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1
	 * CollateralValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesCollDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCollateralDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the securities collateral."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmSecuritiesCollateral
	 * CollateralValuation2.mmSecuritiesCollateral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesCollateralDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation1.mmObject();
			isDerived = false;
			xmlTag = "SctiesCollDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCollateralDetails";
			definition = "Provides details on the securities collateral.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation2.mmSecuritiesCollateral);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesCollateral1.mmObject();
		}
	};
	@XmlElement(name = "CshCollDtls")
	protected CashCollateral1 cashCollateralDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashCollateral1
	 * CashCollateral1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Money Money}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1
	 * CollateralValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshCollDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashCollateralDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on the cash collateral valuation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmCashCollateral
	 * CollateralValuation2.mmCashCollateral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashCollateralDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Money.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation1.mmObject();
			isDerived = false;
			xmlTag = "CshCollDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashCollateralDetails";
			definition = "Provides details on the cash collateral valuation.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation2.mmCashCollateral);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashCollateral1.mmObject();
		}
	};
	@XmlElement(name = "OthrCollDtls")
	protected OtherCollateral1 otherCollateralDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherCollateral1
	 * OtherCollateral1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation1
	 * CollateralValuation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrCollDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCollateralDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details on other collateral valuation."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralValuation2#mmOtherCollateral
	 * CollateralValuation2.mmOtherCollateral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherCollateralDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Asset.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralValuation1.mmObject();
			isDerived = false;
			xmlTag = "OthrCollDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCollateralDetails";
			definition = "Provides details on other collateral valuation.";
			nextVersions_lazy = () -> Arrays.asList(CollateralValuation2.mmOtherCollateral);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OtherCollateral1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralValuation1.mmCollateralReference, com.tools20022.repository.msg.CollateralValuation1.mmCollateralType,
						com.tools20022.repository.msg.CollateralValuation1.mmSettlementStatus, com.tools20022.repository.msg.CollateralValuation1.mmNumberOfDaysAccrued, com.tools20022.repository.msg.CollateralValuation1.mmAmountDetails,
						com.tools20022.repository.msg.CollateralValuation1.mmDayCountBasis, com.tools20022.repository.msg.CollateralValuation1.mmExchangeRate, com.tools20022.repository.msg.CollateralValuation1.mmCurrencyHaircut,
						com.tools20022.repository.msg.CollateralValuation1.mmAdjustedRate, com.tools20022.repository.msg.CollateralValuation1.mmSecuritiesCollateralDetails,
						com.tools20022.repository.msg.CollateralValuation1.mmCashCollateralDetails, com.tools20022.repository.msg.CollateralValuation1.mmOtherCollateralDetails);
				trace_lazy = () -> CollateralValuation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralValuation1";
				definition = "Provides details about the valuation of each piece of collateral that is posted.";
				nextVersions_lazy = () -> Arrays.asList(CollateralValuation2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCollateralReference() {
		return collateralReference;
	}

	public CollateralValuation1 setCollateralReference(Max35Text collateralReference) {
		this.collateralReference = Objects.requireNonNull(collateralReference);
		return this;
	}

	public CollateralType1Code getCollateralType() {
		return collateralType;
	}

	public CollateralValuation1 setCollateralType(CollateralType1Code collateralType) {
		this.collateralType = Objects.requireNonNull(collateralType);
		return this;
	}

	public SettlementStatus2Code getSettlementStatus() {
		return settlementStatus;
	}

	public CollateralValuation1 setSettlementStatus(SettlementStatus2Code settlementStatus) {
		this.settlementStatus = Objects.requireNonNull(settlementStatus);
		return this;
	}

	public Number getNumberOfDaysAccrued() {
		return numberOfDaysAccrued;
	}

	public CollateralValuation1 setNumberOfDaysAccrued(Number numberOfDaysAccrued) {
		this.numberOfDaysAccrued = Objects.requireNonNull(numberOfDaysAccrued);
		return this;
	}

	public CollateralAmount1 getAmountDetails() {
		return amountDetails;
	}

	public CollateralValuation1 setAmountDetails(com.tools20022.repository.msg.CollateralAmount1 amountDetails) {
		this.amountDetails = Objects.requireNonNull(amountDetails);
		return this;
	}

	public InterestComputationMethod2Code getDayCountBasis() {
		return dayCountBasis;
	}

	public CollateralValuation1 setDayCountBasis(InterestComputationMethod2Code dayCountBasis) {
		this.dayCountBasis = Objects.requireNonNull(dayCountBasis);
		return this;
	}

	public Optional<BaseOneRate> getExchangeRate() {
		return exchangeRate == null ? Optional.empty() : Optional.of(exchangeRate);
	}

	public CollateralValuation1 setExchangeRate(BaseOneRate exchangeRate) {
		this.exchangeRate = exchangeRate;
		return this;
	}

	public Optional<BaseOneRate> getCurrencyHaircut() {
		return currencyHaircut == null ? Optional.empty() : Optional.of(currencyHaircut);
	}

	public CollateralValuation1 setCurrencyHaircut(BaseOneRate currencyHaircut) {
		this.currencyHaircut = currencyHaircut;
		return this;
	}

	public Optional<BaseOneRate> getAdjustedRate() {
		return adjustedRate == null ? Optional.empty() : Optional.of(adjustedRate);
	}

	public CollateralValuation1 setAdjustedRate(BaseOneRate adjustedRate) {
		this.adjustedRate = adjustedRate;
		return this;
	}

	public Optional<SecuritiesCollateral1> getSecuritiesCollateralDetails() {
		return securitiesCollateralDetails == null ? Optional.empty() : Optional.of(securitiesCollateralDetails);
	}

	public CollateralValuation1 setSecuritiesCollateralDetails(com.tools20022.repository.msg.SecuritiesCollateral1 securitiesCollateralDetails) {
		this.securitiesCollateralDetails = securitiesCollateralDetails;
		return this;
	}

	public Optional<CashCollateral1> getCashCollateralDetails() {
		return cashCollateralDetails == null ? Optional.empty() : Optional.of(cashCollateralDetails);
	}

	public CollateralValuation1 setCashCollateralDetails(com.tools20022.repository.msg.CashCollateral1 cashCollateralDetails) {
		this.cashCollateralDetails = cashCollateralDetails;
		return this;
	}

	public Optional<OtherCollateral1> getOtherCollateralDetails() {
		return otherCollateralDetails == null ? Optional.empty() : Optional.of(otherCollateralDetails);
	}

	public CollateralValuation1 setOtherCollateralDetails(com.tools20022.repository.msg.OtherCollateral1 otherCollateralDetails) {
		this.otherCollateralDetails = otherCollateralDetails;
		return this;
	}
}