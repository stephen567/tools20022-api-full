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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the market and statistic conditions upon which a liquidity
 * indicator has been computed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode#FiveDayMovingAverage
 * LiquidityIndicatorTypeCode.FiveDayMovingAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode#TwentyDayMovingAverage
 * LiquidityIndicatorTypeCode.TwentyDayMovingAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode#NormalMarketSize
 * LiquidityIndicatorTypeCode.NormalMarketSize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode#Other
 * LiquidityIndicatorTypeCode.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorType1Code
 * LiquidityIndicatorType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FIVE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LiquidityIndicatorTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the market and statistic conditions upon which a liquidity indicator has been computed."
 * </li>
 * </ul>
 */
public class LiquidityIndicatorTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Computation is on the average value of the price of a security over a
	 * period of five days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode
	 * LiquidityIndicatorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FIVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiveDayMovingAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Computation is on the average value of the price of a security over a period of five days."
	 * </li>
	 * </ul>
	 */
	public static final MMCode FiveDayMovingAverage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiveDayMovingAverage";
			definition = "Computation is on the average value of the price of a security over a period of five days.";
			owner_lazy = () -> LiquidityIndicatorTypeCode.mmObject();
			codeName = "FIVE";
		}
	};
	/**
	 * Computation is on the average value of the price of a security over a
	 * period of 20 days.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode
	 * LiquidityIndicatorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TWEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwentyDayMovingAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Computation is on the average value of the price of a security over a period of 20 days."
	 * </li>
	 * </ul>
	 */
	public static final MMCode TwentyDayMovingAverage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwentyDayMovingAverage";
			definition = "Computation is on the average value of the price of a security over a period of 20 days.";
			owner_lazy = () -> LiquidityIndicatorTypeCode.mmObject();
			codeName = "TWEN";
		}
	};
	/**
	 * Computation is on the standard market conditions and volume.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode
	 * LiquidityIndicatorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NORM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NormalMarketSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Computation is on the standard market conditions and volume."</li>
	 * </ul>
	 */
	public static final MMCode NormalMarketSize = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NormalMarketSize";
			definition = "Computation is on the standard market conditions and volume.";
			owner_lazy = () -> LiquidityIndicatorTypeCode.mmObject();
			codeName = "NORM";
		}
	};
	/**
	 * Computation is on another price computation method.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode
	 * LiquidityIndicatorTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Computation is on another price computation method."</li>
	 * </ul>
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Computation is on another price computation method.";
			owner_lazy = () -> LiquidityIndicatorTypeCode.mmObject();
			codeName = "OTHE";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("FIVE");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "LiquidityIndicatorTypeCode";
				definition = "Specifies the market and statistic conditions upon which a liquidity indicator has been computed.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LiquidityIndicatorTypeCode.FiveDayMovingAverage, com.tools20022.repository.codeset.LiquidityIndicatorTypeCode.TwentyDayMovingAverage,
						com.tools20022.repository.codeset.LiquidityIndicatorTypeCode.NormalMarketSize, com.tools20022.repository.codeset.LiquidityIndicatorTypeCode.Other);
				derivation_lazy = () -> Arrays.asList(LiquidityIndicatorType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}