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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.EventFrequencyCode;
import com.tools20022.repository.codeset.ValuationTimingCode;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Calculation of the net asset value for an investment fund/fund class.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="NetAssetValueCalculation"
 * src="doc-files/NetAssetValueCalculation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationFrequency
 * NetAssetValueCalculation.mmValuationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationDateTime
 * NetAssetValueCalculation.mmValuationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmNetAssetValue
 * NetAssetValueCalculation.mmNetAssetValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmRelatedFund
 * NetAssetValueCalculation.mmRelatedFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationType
 * NetAssetValueCalculation.mmValuationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmSuspendedIndicator
 * NetAssetValueCalculation.mmSuspendedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmForExecutionIndicator
 * NetAssetValueCalculation.mmForExecutionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxLiability
 * NetAssetValueCalculation.mmTaxLiability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmTaxRefund
 * NetAssetValueCalculation.mmTaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmOfficialValuationIndicator
 * NetAssetValueCalculation.mmOfficialValuationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmEstimatedPriceIndicator
 * NetAssetValueCalculation.mmEstimatedPriceIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmValuationStatistics
 * NetAssetValueCalculation.mmValuationStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmInvestmentFundPerformanceFactors
 * NetAssetValueCalculation.mmInvestmentFundPerformanceFactors}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmPrice
 * NetAssetValueCalculation.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmSecuritiesQuantity
 * NetAssetValueCalculation.mmSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmInterest
 * NetAssetValueCalculation.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmFundsCashFlow
 * NetAssetValueCalculation.mmFundsCashFlow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmDeclarationChannel
 * NetAssetValueCalculation.mmDeclarationChannel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmDeclarationDate
 * NetAssetValueCalculation.mmDeclarationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmFirstValuationDate
 * NetAssetValueCalculation.mmFirstValuationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmHistoricPricingIndicator
 * NetAssetValueCalculation.mmHistoricPricingIndicator}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmNetAssetValueCalculation
 * InvestmentFundClass.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmNetAssetValueCalculation
 * SecuritiesPricing.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxLiabilityValueCalculation
 * Tax.mmTaxLiabilityValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxRefundValueCalculation
 * Tax.mmTaxRefundValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNetAssetValueCalculation
 * SecuritiesQuantity.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmNetAssetValueCalculation
 * ValuationStatistics.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#mmNetAssetValueCalculation
 * PerformanceFactors.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedNetAssetValueCalculation
 * Interest.mmRelatedNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmNetAssetValueCalculation
 * FundsCashFlow.mmNetAssetValueCalculation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceReport2#mmPriceValuationDetails
 * PriceReport2.mmPriceValuationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceReport3#mmPriceValuationDetails
 * PriceReport3.mmPriceValuationDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation2
 * PriceValuation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation3
 * PriceValuation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation4
 * PriceValuation4}</li>
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
 * "NetAssetValueCalculation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Calculation of the net asset value for an investment fund/fund class."</li>
 * </ul>
 */
public class NetAssetValueCalculation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected EventFrequencyCode valuationFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EventFrequencyCode
	 * EventFrequencyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics#mmValuationFrequency
	 * ValuationDealingProcessingCharacteristics.mmValuationFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2#mmValuationFrequency
	 * ValuationDealingProcessingCharacteristics2.mmValuationFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmValuationFrequency
	 * PriceValuation3.mmValuationFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmValuationFrequency
	 * PriceValuation4.mmValuationFrequency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Frequency of the valuation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmValuationFrequency = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ValuationDealingProcessingCharacteristics.mmValuationFrequency, ValuationDealingProcessingCharacteristics2.mmValuationFrequency, PriceValuation3.mmValuationFrequency,
					PriceValuation4.mmValuationFrequency);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValuationFrequency";
			definition = "Frequency of the valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EventFrequencyCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getValuationFrequency", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime valuationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundParameters3#mmValuationDateTime
	 * FundParameters3.mmValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2#mmValuationDateTime
	 * PriceValuation2.mmValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2#mmNextValuationDateTime
	 * PriceValuation2.mmNextValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2#mmPreviousValuationDateTime
	 * PriceValuation2.mmPreviousValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmValuationDateTime
	 * PriceValuation3.mmValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmNAVDateTime
	 * PriceValuation3.mmNAVDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmNextValuationDateTime
	 * PriceValuation3.mmNextValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmPreviousValuationDateTime
	 * PriceValuation3.mmPreviousValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmValuationDateTime
	 * PriceValuation4.mmValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmNAVDateTime
	 * PriceValuation4.mmNAVDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmNextValuationDateTime
	 * PriceValuation4.mmNextValuationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmPreviousValuationDateTime
	 * PriceValuation4.mmPreviousValuationDateTime}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order16#mmNAVDate
	 * Order16.mmNAVDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order14#mmNAVDate
	 * Order14.mmNAVDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution10#mmNAVDate
	 * RedemptionExecution10.mmNAVDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution7#mmNAVDate
	 * SubscriptionExecution7.mmNAVDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmNAVDate
	 * Order17.mmNAVDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmNAVDate
	 * Order18.mmNAVDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the price valuation for the investment fund/fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmValuationDateTime = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(FundParameters3.mmValuationDateTime, PriceValuation2.mmValuationDateTime, PriceValuation2.mmNextValuationDateTime, PriceValuation2.mmPreviousValuationDateTime,
					PriceValuation3.mmValuationDateTime, PriceValuation3.mmNAVDateTime, PriceValuation3.mmNextValuationDateTime, PriceValuation3.mmPreviousValuationDateTime, PriceValuation4.mmValuationDateTime,
					PriceValuation4.mmNAVDateTime, PriceValuation4.mmNextValuationDateTime, PriceValuation4.mmPreviousValuationDateTime, Order16.mmNAVDate, Order14.mmNAVDate, RedemptionExecution10.mmNAVDate,
					SubscriptionExecution7.mmNAVDate, Order17.mmNAVDate, Order18.mmNAVDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValuationDateTime";
			definition = "Date and time of the price valuation for the investment fund/fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getValuationDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CurrencyAndAmount netAssetValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation2#mmTotalNAV
	 * PriceValuation2.mmTotalNAV}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation3#mmTotalNAV
	 * PriceValuation3.mmTotalNAV}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValuation4#mmTotalNAV
	 * PriceValuation4.mmTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#mmTotalNAV
	 * FundCashForecast1.mmTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#mmPreviousTotalNAV
	 * FundCashForecast1.mmPreviousTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmTotalNAV
	 * FundCashForecast3.mmTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmPreviousTotalNAV
	 * FundCashForecast3.mmPreviousTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#mmTotalNAV
	 * FundCashForecast2.mmTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#mmPreviousTotalNAV
	 * FundCashForecast2.mmPreviousTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmTotalNAV
	 * FundCashForecast4.mmTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmPreviousTotalNAV
	 * FundCashForecast4.mmPreviousTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#mmEstimatedTotalNAV
	 * EstimatedFundCashForecast2.mmEstimatedTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast2#mmPreviousEstimatedTotalNAV
	 * EstimatedFundCashForecast2.mmPreviousEstimatedTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#mmEstimatedTotalNAV
	 * EstimatedFundCashForecast4.mmEstimatedTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast4#mmPreviousTotalNAV
	 * EstimatedFundCashForecast4.mmPreviousTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#mmEstimatedTotalNAV
	 * EstimatedFundCashForecast1.mmEstimatedTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast1#mmPreviousEstimatedTotalNAV
	 * EstimatedFundCashForecast1.mmPreviousEstimatedTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmEstimatedTotalNAV
	 * EstimatedFundCashForecast3.mmEstimatedTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast3#mmPreviousTotalNAV
	 * EstimatedFundCashForecast3.mmPreviousTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFund1#mmTotalValue
	 * InvestmentFund1.mmTotalValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmTotalNAV
	 * FundCashForecast7.mmTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmPreviousTotalNAV
	 * FundCashForecast7.mmPreviousTotalNAV}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmTotalNAV
	 * Fund2.mmTotalNAV}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund2#mmPreviousTotalNAV
	 * Fund2.mmPreviousTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmEstimatedTotalNAV
	 * EstimatedFundCashForecast6.mmEstimatedTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast6#mmPreviousTotalNAV
	 * EstimatedFundCashForecast6.mmPreviousTotalNAV}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmEstimatedTotalNAV
	 * Fund1.mmEstimatedTotalNAV}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund1#mmPreviousTotalNAV
	 * Fund1.mmPreviousTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmTotalNAV
	 * FundCashForecast6.mmTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmPreviousTotalNAV
	 * FundCashForecast6.mmPreviousTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmEstimatedTotalNAV
	 * EstimatedFundCashForecast5.mmEstimatedTotalNAV}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.EstimatedFundCashForecast5#mmPreviousTotalNAV
	 * EstimatedFundCashForecast5.mmPreviousTotalNAV}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmEstimatedTotalNAV
	 * Fund3.mmEstimatedTotalNAV}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund3#mmPreviousTotalNAV
	 * Fund3.mmPreviousTotalNAV}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund4#mmTotalNAV
	 * Fund4.mmTotalNAV}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Fund4#mmPreviousTotalNAV
	 * Fund4.mmPreviousTotalNAV}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNetAssetValue = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PriceValuation2.mmTotalNAV, PriceValuation3.mmTotalNAV, PriceValuation4.mmTotalNAV, FundCashForecast1.mmTotalNAV, FundCashForecast1.mmPreviousTotalNAV, FundCashForecast3.mmTotalNAV,
					FundCashForecast3.mmPreviousTotalNAV, FundCashForecast2.mmTotalNAV, FundCashForecast2.mmPreviousTotalNAV, FundCashForecast4.mmTotalNAV, FundCashForecast4.mmPreviousTotalNAV,
					EstimatedFundCashForecast2.mmEstimatedTotalNAV, EstimatedFundCashForecast2.mmPreviousEstimatedTotalNAV, EstimatedFundCashForecast4.mmEstimatedTotalNAV, EstimatedFundCashForecast4.mmPreviousTotalNAV,
					EstimatedFundCashForecast1.mmEstimatedTotalNAV, EstimatedFundCashForecast1.mmPreviousEstimatedTotalNAV, EstimatedFundCashForecast3.mmEstimatedTotalNAV, EstimatedFundCashForecast3.mmPreviousTotalNAV,
					InvestmentFund1.mmTotalValue, FundCashForecast7.mmTotalNAV, FundCashForecast7.mmPreviousTotalNAV, Fund2.mmTotalNAV, Fund2.mmPreviousTotalNAV, EstimatedFundCashForecast6.mmEstimatedTotalNAV,
					EstimatedFundCashForecast6.mmPreviousTotalNAV, Fund1.mmEstimatedTotalNAV, Fund1.mmPreviousTotalNAV, FundCashForecast6.mmTotalNAV, FundCashForecast6.mmPreviousTotalNAV, EstimatedFundCashForecast5.mmEstimatedTotalNAV,
					EstimatedFundCashForecast5.mmPreviousTotalNAV, Fund3.mmEstimatedTotalNAV, Fund3.mmPreviousTotalNAV, Fund4.mmTotalNAV, Fund4.mmPreviousTotalNAV);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValue";
			definition = "Value of all the holdings, less the fund's liabilities, attributable to a specific investment fund class.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getNetAssetValue", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected InvestmentFundClass relatedFund;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass#mmNetAssetValueCalculation
	 * InvestmentFundClass.mmNetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2#mmTotalUnitsNumber
	 * PriceValuation2.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmTotalUnitsNumber
	 * PriceValuation3.mmTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmFinancialInstrumentDetails
	 * PriceValuation4.mmFinancialInstrumentDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast1#mmPreviousTotalUnitsNumber
	 * FundCashForecast1.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast3#mmPreviousTotalUnitsNumber
	 * FundCashForecast3.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast2#mmPreviousTotalUnitsNumber
	 * FundCashForecast2.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast4#mmPreviousTotalUnitsNumber
	 * FundCashForecast4.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast7#mmPreviousTotalUnitsNumber
	 * FundCashForecast7.mmPreviousTotalUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FundCashForecast6#mmPreviousTotalUnitsNumber
	 * FundCashForecast6.mmPreviousTotalUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the fund for which the NAV is calculated (per fund unit)."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedFund = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PriceValuation2.mmTotalUnitsNumber, PriceValuation3.mmTotalUnitsNumber, PriceValuation4.mmFinancialInstrumentDetails, FundCashForecast1.mmPreviousTotalUnitsNumber,
					FundCashForecast3.mmPreviousTotalUnitsNumber, FundCashForecast2.mmPreviousTotalUnitsNumber, FundCashForecast4.mmPreviousTotalUnitsNumber, FundCashForecast7.mmPreviousTotalUnitsNumber,
					FundCashForecast6.mmPreviousTotalUnitsNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedFund";
			definition = "Specifies the fund for which the NAV is calculated (per fund unit).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmNetAssetValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundClass.mmObject();
		}
	};
	protected ValuationTimingCode valuationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ValuationTimingCode
	 * ValuationTimingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2#mmValuationCycle
	 * PriceValuation2.mmValuationCycle}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmValuationType
	 * PriceValuation3.mmValuationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmValuationType
	 * PriceValuation4.mmValuationType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the valuation is done, based on the schedule stated in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmValuationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PriceValuation2.mmValuationCycle, PriceValuation3.mmValuationType, PriceValuation4.mmValuationType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValuationType";
			definition = "Specifies how the valuation is done, based on the schedule stated in the prospectus.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ValuationTimingCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getValuationType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator suspendedIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation2#mmSuspendedIndicator
	 * PriceValuation2.mmSuspendedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmSuspendedIndicator
	 * PriceValuation3.mmSuspendedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmSuspendedIndicator
	 * PriceValuation4.mmSuspendedIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspendedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the valuation of the investment fund class is suspended."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSuspendedIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PriceValuation2.mmSuspendedIndicator, PriceValuation3.mmSuspendedIndicator, PriceValuation4.mmSuspendedIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuspendedIndicator";
			definition = "Indicates whether the valuation of the investment fund class is suspended.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getSuspendedIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator forExecutionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmForExecutionIndicator
	 * UnitPrice6.mmForExecutionIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmForExecutionIndicator
	 * UnitPrice15.mmForExecutionIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForExecutionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the price information can be used for the execution of a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmForExecutionIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice6.mmForExecutionIndicator, UnitPrice15.mmForExecutionIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ForExecutionIndicator";
			definition = "Indicates whether the price information can be used for the execution of a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getForExecutionIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Tax taxLiability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxLiabilityValueCalculation
	 * Tax.mmTaxLiabilityValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmTaxLiabilityDetails
	 * UnitPrice6.mmTaxLiabilityDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmTaxLiabilityDetails
	 * UnitPrice15.mmTaxLiabilityDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxLiability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to taxes that are due."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxLiability = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice6.mmTaxLiabilityDetails, UnitPrice15.mmTaxLiabilityDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxLiability";
			definition = "Information related to taxes that are due.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmTaxLiabilityValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected Tax taxRefund;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxRefundValueCalculation
	 * Tax.mmTaxRefundValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice6#mmTaxRefundDetails
	 * UnitPrice6.mmTaxRefundDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmTaxRefundDetails
	 * UnitPrice15.mmTaxRefundDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRefund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to taxes that are paid back."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxRefund = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice6.mmTaxRefundDetails, UnitPrice15.mmTaxRefundDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxRefund";
			definition = "Information related to taxes that are paid back.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Tax.mmTaxRefundValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Tax.mmObject();
		}
	};
	protected YesNoIndicator officialValuationIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmOfficialValuationIndicator
	 * PriceValuation3.mmOfficialValuationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmOfficialValuationIndicator
	 * PriceValuation4.mmOfficialValuationIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialValuationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the valuation is an official valuation."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOfficialValuationIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PriceValuation3.mmOfficialValuationIndicator, PriceValuation4.mmOfficialValuationIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfficialValuationIndicator";
			definition = "Indicates whether the valuation is an official valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getOfficialValuationIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator estimatedPriceIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmEstimatedPriceIndicator
	 * UnitPrice15.mmEstimatedPriceIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EstimatedPriceIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the price is an estimated price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEstimatedPriceIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice15.mmEstimatedPriceIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EstimatedPriceIndicator";
			definition = "Indicates whether the price is an estimated price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getEstimatedPriceIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ValuationStatistics> valuationStatistics;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmNetAssetValueCalculation
	 * ValuationStatistics.mmNetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmValuationStatistics
	 * PriceValuation3.mmValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmValuationStatistics
	 * PriceValuation4.mmValuationStatistics}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValuationStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the price variations of an investment fund class."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmValuationStatistics = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PriceValuation3.mmValuationStatistics, PriceValuation4.mmValuationStatistics);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValuationStatistics";
			definition = "Information related to the price variations of an investment fund class.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmNetAssetValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmObject();
		}
	};
	protected PerformanceFactors investmentFundPerformanceFactors;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.PerformanceFactors#mmNetAssetValueCalculation
	 * PerformanceFactors.mmNetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.PerformanceFactors
	 * PerformanceFactors}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation3#mmPerformanceDetails
	 * PriceValuation3.mmPerformanceDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmPerformanceDetails
	 * PriceValuation4.mmPerformanceDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentFundPerformanceFactors"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Factors that give indications about the performance of a fund."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInvestmentFundPerformanceFactors = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PriceValuation3.mmPerformanceDetails, PriceValuation4.mmPerformanceDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InvestmentFundPerformanceFactors";
			definition = "Factors that give indications about the performance of a fund.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.PerformanceFactors.mmNetAssetValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.PerformanceFactors.mmObject();
		}
	};
	protected SecuritiesPricing price;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmNetAssetValueCalculation
	 * SecuritiesPricing.mmNetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmPriceDetails
	 * PriceValuation4.mmPriceDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price derived from the net asset value."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PriceValuation4.mmPriceDetails);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Price derived from the net asset value.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmNetAssetValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmNetAssetValueCalculation
	 * SecuritiesQuantity.mmNetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
	 * SecuritiesQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4#mmTotalUnitsNumber
	 * PriceValuation4.mmTotalUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity on which the NAV is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PriceValuation4.mmTotalUnitsNumber);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesQuantity";
			definition = "Quantity on which the NAV is calculated.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmNetAssetValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesQuantity.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Interest> interest;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRelatedNetAssetValueCalculation
	 * Interest.mmRelatedNetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest that has accumulated between the most recent payment of interest and the sale of the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInterest = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Interest that has accumulated between the most recent payment of interest and the sale of the financial instrument.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Interest.mmRelatedNetAssetValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Interest.mmObject();
		}
	};
	protected FundsCashFlow fundsCashFlow;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.FundsCashFlow#mmNetAssetValueCalculation
	 * FundsCashFlow.mmNetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.FundsCashFlow
	 * FundsCashFlow}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsCashFlow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Net cash flow for a valuation date, which is incorporated in the NAV."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFundsCashFlow = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundsCashFlow";
			definition = "Net cash flow for a valuation date, which is incorporated in the NAV.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmNetAssetValueCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.FundsCashFlow.mmObject();
		}
	};
	protected Max35Text declarationChannel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Means of the net asset value publication, for example, a newspaper."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDeclarationChannel = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeclarationChannel";
			definition = "Means of the net asset value publication, for example, a newspaper.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getDeclarationChannel", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime declarationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeclarationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time of the net asset value publication."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDeclarationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DeclarationDate";
			definition = "Date/time of the net asset value publication.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getDeclarationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODate firstValuationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstValuationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the investment fund class was first priced."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmFirstValuationDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstValuationDate";
			definition = "Date on which the investment fund class was first priced.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getFirstValuationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator historicPricingIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HistoricPricingIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the price is historic or forward."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmHistoricPricingIndicator = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HistoricPricingIndicator";
			definition = "Indicates whether the price is historic or forward.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return NetAssetValueCalculation.class.getMethod("getHistoricPricingIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NetAssetValueCalculation";
				definition = "Calculation of the net asset value for an investment fund/fund class.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.InvestmentFundClass.mmNetAssetValueCalculation, com.tools20022.repository.entity.SecuritiesPricing.mmNetAssetValueCalculation,
						com.tools20022.repository.entity.Tax.mmTaxLiabilityValueCalculation, com.tools20022.repository.entity.Tax.mmTaxRefundValueCalculation, com.tools20022.repository.entity.SecuritiesQuantity.mmNetAssetValueCalculation,
						com.tools20022.repository.entity.ValuationStatistics.mmNetAssetValueCalculation, com.tools20022.repository.entity.PerformanceFactors.mmNetAssetValueCalculation,
						com.tools20022.repository.entity.Interest.mmRelatedNetAssetValueCalculation, com.tools20022.repository.entity.FundsCashFlow.mmNetAssetValueCalculation);
				derivationElement_lazy = () -> Arrays.asList(PriceReport2.mmPriceValuationDetails, PriceReport3.mmPriceValuationDetails);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.NetAssetValueCalculation.mmValuationFrequency, com.tools20022.repository.entity.NetAssetValueCalculation.mmValuationDateTime,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmNetAssetValue, com.tools20022.repository.entity.NetAssetValueCalculation.mmRelatedFund,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmValuationType, com.tools20022.repository.entity.NetAssetValueCalculation.mmSuspendedIndicator,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmForExecutionIndicator, com.tools20022.repository.entity.NetAssetValueCalculation.mmTaxLiability,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmTaxRefund, com.tools20022.repository.entity.NetAssetValueCalculation.mmOfficialValuationIndicator,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmEstimatedPriceIndicator, com.tools20022.repository.entity.NetAssetValueCalculation.mmValuationStatistics,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmInvestmentFundPerformanceFactors, com.tools20022.repository.entity.NetAssetValueCalculation.mmPrice,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmSecuritiesQuantity, com.tools20022.repository.entity.NetAssetValueCalculation.mmInterest,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmFundsCashFlow, com.tools20022.repository.entity.NetAssetValueCalculation.mmDeclarationChannel,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmDeclarationDate, com.tools20022.repository.entity.NetAssetValueCalculation.mmFirstValuationDate,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmHistoricPricingIndicator);
				derivationComponent_lazy = () -> Arrays.asList(PriceValuation2.mmObject(), PriceValuation3.mmObject(), PriceValuation4.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return NetAssetValueCalculation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public EventFrequencyCode getValuationFrequency() {
		return valuationFrequency;
	}

	public NetAssetValueCalculation setValuationFrequency(EventFrequencyCode valuationFrequency) {
		this.valuationFrequency = Objects.requireNonNull(valuationFrequency);
		return this;
	}

	public ISODateTime getValuationDateTime() {
		return valuationDateTime;
	}

	public NetAssetValueCalculation setValuationDateTime(ISODateTime valuationDateTime) {
		this.valuationDateTime = Objects.requireNonNull(valuationDateTime);
		return this;
	}

	public CurrencyAndAmount getNetAssetValue() {
		return netAssetValue;
	}

	public NetAssetValueCalculation setNetAssetValue(CurrencyAndAmount netAssetValue) {
		this.netAssetValue = Objects.requireNonNull(netAssetValue);
		return this;
	}

	public InvestmentFundClass getRelatedFund() {
		return relatedFund;
	}

	public NetAssetValueCalculation setRelatedFund(com.tools20022.repository.entity.InvestmentFundClass relatedFund) {
		this.relatedFund = Objects.requireNonNull(relatedFund);
		return this;
	}

	public ValuationTimingCode getValuationType() {
		return valuationType;
	}

	public NetAssetValueCalculation setValuationType(ValuationTimingCode valuationType) {
		this.valuationType = Objects.requireNonNull(valuationType);
		return this;
	}

	public YesNoIndicator getSuspendedIndicator() {
		return suspendedIndicator;
	}

	public NetAssetValueCalculation setSuspendedIndicator(YesNoIndicator suspendedIndicator) {
		this.suspendedIndicator = Objects.requireNonNull(suspendedIndicator);
		return this;
	}

	public YesNoIndicator getForExecutionIndicator() {
		return forExecutionIndicator;
	}

	public NetAssetValueCalculation setForExecutionIndicator(YesNoIndicator forExecutionIndicator) {
		this.forExecutionIndicator = Objects.requireNonNull(forExecutionIndicator);
		return this;
	}

	public Tax getTaxLiability() {
		return taxLiability;
	}

	public NetAssetValueCalculation setTaxLiability(com.tools20022.repository.entity.Tax taxLiability) {
		this.taxLiability = Objects.requireNonNull(taxLiability);
		return this;
	}

	public Tax getTaxRefund() {
		return taxRefund;
	}

	public NetAssetValueCalculation setTaxRefund(com.tools20022.repository.entity.Tax taxRefund) {
		this.taxRefund = Objects.requireNonNull(taxRefund);
		return this;
	}

	public YesNoIndicator getOfficialValuationIndicator() {
		return officialValuationIndicator;
	}

	public NetAssetValueCalculation setOfficialValuationIndicator(YesNoIndicator officialValuationIndicator) {
		this.officialValuationIndicator = Objects.requireNonNull(officialValuationIndicator);
		return this;
	}

	public YesNoIndicator getEstimatedPriceIndicator() {
		return estimatedPriceIndicator;
	}

	public NetAssetValueCalculation setEstimatedPriceIndicator(YesNoIndicator estimatedPriceIndicator) {
		this.estimatedPriceIndicator = Objects.requireNonNull(estimatedPriceIndicator);
		return this;
	}

	public List<ValuationStatistics> getValuationStatistics() {
		return valuationStatistics == null ? valuationStatistics = new ArrayList<>() : valuationStatistics;
	}

	public NetAssetValueCalculation setValuationStatistics(List<com.tools20022.repository.entity.ValuationStatistics> valuationStatistics) {
		this.valuationStatistics = Objects.requireNonNull(valuationStatistics);
		return this;
	}

	public Optional<PerformanceFactors> getInvestmentFundPerformanceFactors() {
		return investmentFundPerformanceFactors == null ? Optional.empty() : Optional.of(investmentFundPerformanceFactors);
	}

	public NetAssetValueCalculation setInvestmentFundPerformanceFactors(com.tools20022.repository.entity.PerformanceFactors investmentFundPerformanceFactors) {
		this.investmentFundPerformanceFactors = investmentFundPerformanceFactors;
		return this;
	}

	public SecuritiesPricing getPrice() {
		return price;
	}

	public NetAssetValueCalculation setPrice(com.tools20022.repository.entity.SecuritiesPricing price) {
		this.price = Objects.requireNonNull(price);
		return this;
	}

	public List<SecuritiesQuantity> getSecuritiesQuantity() {
		return securitiesQuantity == null ? securitiesQuantity = new ArrayList<>() : securitiesQuantity;
	}

	public NetAssetValueCalculation setSecuritiesQuantity(List<com.tools20022.repository.entity.SecuritiesQuantity> securitiesQuantity) {
		this.securitiesQuantity = Objects.requireNonNull(securitiesQuantity);
		return this;
	}

	public List<Interest> getInterest() {
		return interest == null ? interest = new ArrayList<>() : interest;
	}

	public NetAssetValueCalculation setInterest(List<com.tools20022.repository.entity.Interest> interest) {
		this.interest = Objects.requireNonNull(interest);
		return this;
	}

	public Optional<FundsCashFlow> getFundsCashFlow() {
		return fundsCashFlow == null ? Optional.empty() : Optional.of(fundsCashFlow);
	}

	public NetAssetValueCalculation setFundsCashFlow(com.tools20022.repository.entity.FundsCashFlow fundsCashFlow) {
		this.fundsCashFlow = fundsCashFlow;
		return this;
	}

	public Max35Text getDeclarationChannel() {
		return declarationChannel;
	}

	public NetAssetValueCalculation setDeclarationChannel(Max35Text declarationChannel) {
		this.declarationChannel = Objects.requireNonNull(declarationChannel);
		return this;
	}

	public ISODateTime getDeclarationDate() {
		return declarationDate;
	}

	public NetAssetValueCalculation setDeclarationDate(ISODateTime declarationDate) {
		this.declarationDate = Objects.requireNonNull(declarationDate);
		return this;
	}

	public ISODate getFirstValuationDate() {
		return firstValuationDate;
	}

	public NetAssetValueCalculation setFirstValuationDate(ISODate firstValuationDate) {
		this.firstValuationDate = Objects.requireNonNull(firstValuationDate);
		return this;
	}

	public YesNoIndicator getHistoricPricingIndicator() {
		return historicPricingIndicator;
	}

	public NetAssetValueCalculation setHistoricPricingIndicator(YesNoIndicator historicPricingIndicator) {
		this.historicPricingIndicator = Objects.requireNonNull(historicPricingIndicator);
		return this;
	}
}