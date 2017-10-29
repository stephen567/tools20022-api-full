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
 * Specifies the underlying financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#Basket
 * UnderlyingTypeV3Code.Basket}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#Bond
 * UnderlyingTypeV3Code.Bond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#BondFuture
 * UnderlyingTypeV3Code.BondFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#Commodity
 * UnderlyingTypeV3Code.Commodity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#Currency
 * UnderlyingTypeV3Code.Currency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#DividendIndex
 * UnderlyingTypeV3Code.DividendIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#Equity
 * UnderlyingTypeV3Code.Equity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#ExchangeTradedFund
 * UnderlyingTypeV3Code.ExchangeTradedFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#Future
 * UnderlyingTypeV3Code.Future}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#FutureOnEquity
 * UnderlyingTypeV3Code.FutureOnEquity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#Index
 * UnderlyingTypeV3Code.Index}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#InterestRate
 * UnderlyingTypeV3Code.InterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#Option
 * UnderlyingTypeV3Code.Option}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#OptionOnEquity
 * UnderlyingTypeV3Code.OptionOnEquity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#Other
 * UnderlyingTypeV3Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#PreciousMetal
 * UnderlyingTypeV3Code.PreciousMetal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#Share
 * UnderlyingTypeV3Code.Share}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#StockDividend
 * UnderlyingTypeV3Code.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#StockIndex
 * UnderlyingTypeV3Code.StockIndex}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#Swap
 * UnderlyingTypeV3Code.Swap}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#VolatilityIndex
 * UnderlyingTypeV3Code.VolatilityIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#InterestRateFutureFRA
 * UnderlyingTypeV3Code.InterestRateFutureFRA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code#EmissionAllowance
 * UnderlyingTypeV3Code.EmissionAllowance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingInterestRateType3Code
 * UnderlyingInterestRateType3Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingContractForDifferenceType3Code
 * UnderlyingContractForDifferenceType3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code
 * UnderlyingEquityType6Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnderlyingEquityType5Code
 * UnderlyingEquityType5Code}</li>
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
 * "UnderlyingTypeV3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the underlying financial instrument."</li>
 * </ul>
 */
public class UnderlyingTypeV3Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Underlying is a basket.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSKT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a basket."</li>
	 * </ul>
	 */
	public static final MMCode Basket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Basket";
			definition = "Underlying is a basket.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "BSKT";
		}
	};
	/**
	 * Underlying is a bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a bond."</li>
	 * </ul>
	 */
	public static final MMCode Bond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bond";
			definition = "Underlying is a bond.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "BOND";
		}
	};
	/**
	 * Underlying is a bond future.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BNDF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondFuture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a bond future."</li>
	 * </ul>
	 */
	public static final MMCode BondFuture = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondFuture";
			definition = "Underlying is a bond future.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "BNDF";
		}
	};
	/**
	 * Underlying is a commodity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Commodity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a commodity."</li>
	 * </ul>
	 */
	public static final MMCode Commodity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Commodity";
			definition = "Underlying is a commodity.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Underlying is a currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CURR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a currency."</li>
	 * </ul>
	 */
	public static final MMCode Currency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Underlying is a currency.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "CURR";
		}
	};
	/**
	 * Underlying is a dividend index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIVI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a dividend index."</li>
	 * </ul>
	 */
	public static final MMCode DividendIndex = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendIndex";
			definition = "Underlying is a dividend index.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "DIVI";
		}
	};
	/**
	 * Underlying is an equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQUI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Equity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is an equity."</li>
	 * </ul>
	 */
	public static final MMCode Equity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Equity";
			definition = "Underlying is an equity.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "EQUI";
		}
	};
	/**
	 * Underlying is an exchange traded fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ETFS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedFund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is an exchange traded fund."</li>
	 * </ul>
	 */
	public static final MMCode ExchangeTradedFund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFund";
			definition = "Underlying is an exchange traded fund.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "ETFS";
		}
	};
	/**
	 * Underlying is a future.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Future"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a future."</li>
	 * </ul>
	 */
	public static final MMCode Future = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Future";
			definition = "Underlying is a future.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "FUTR";
		}
	};
	/**
	 * Underlying is a future on equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FTEQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FutureOnEquity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a future on equity."</li>
	 * </ul>
	 */
	public static final MMCode FutureOnEquity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FutureOnEquity";
			definition = "Underlying is a future on equity.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "FTEQ";
		}
	};
	/**
	 * Underlying is an index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is an index."</li>
	 * </ul>
	 */
	public static final MMCode Index = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Index";
			definition = "Underlying is an index.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "INDX";
		}
	};
	/**
	 * Underlying is interest rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is interest rate."</li>
	 * </ul>
	 */
	public static final MMCode InterestRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Underlying is interest rate.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * Underlying is an option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is an option."</li>
	 * </ul>
	 */
	public static final MMCode Option = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Option";
			definition = "Underlying is an option.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "OPTN";
		}
	};
	/**
	 * Underlying is an option on equity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionOnEquity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is an option on equity."</li>
	 * </ul>
	 */
	public static final MMCode OptionOnEquity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionOnEquity";
			definition = "Underlying is an option on equity.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "OPEQ";
		}
	};
	/**
	 * Underlying is of other type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is of other type."</li>
	 * </ul>
	 */
	public static final MMCode Other = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Underlying is of other type.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Underlying is precious metal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreciousMetal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is precious metal."</li>
	 * </ul>
	 */
	public static final MMCode PreciousMetal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreciousMetal";
			definition = "Underlying is precious metal.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "PRME";
		}
	};
	/**
	 * Underlying is a share.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHRS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Share"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a share."</li>
	 * </ul>
	 */
	public static final MMCode Share = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Share";
			definition = "Underlying is a share.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "SHRS";
		}
	};
	/**
	 * Underlying is a stock dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a stock dividend."</li>
	 * </ul>
	 */
	public static final MMCode StockDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			definition = "Underlying is a stock dividend.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "DVSE";
		}
	};
	/**
	 * Underlying is a stock index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STIX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a stock index."</li>
	 * </ul>
	 */
	public static final MMCode StockIndex = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockIndex";
			definition = "Underlying is a stock index.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "STIX";
		}
	};
	/**
	 * Underlying is a swap.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swap"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a swap."</li>
	 * </ul>
	 */
	public static final MMCode Swap = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swap";
			definition = "Underlying is a swap.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "SWAP";
		}
	};
	/**
	 * Underlying is a volatility index.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VOLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolatilityIndex"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is a volatility index."</li>
	 * </ul>
	 */
	public static final MMCode VolatilityIndex = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolatilityIndex";
			definition = "Underlying is a volatility index.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "VOLI";
		}
	};
	/**
	 * Underlying is an interest rate future or a forward rate agreement (FRA).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IFUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRateFutureFRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying is an interest rate future or a forward rate agreement (FRA)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode InterestRateFutureFRA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRateFutureFRA";
			definition = "Underlying is an interest rate future or a forward rate agreement (FRA).";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "IFUT";
		}
	};
	/**
	 * Underlying is an emission allowance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
	 * UnderlyingTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmissionAllowance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying is an emission allowance."</li>
	 * </ul>
	 */
	public static final MMCode EmissionAllowance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmissionAllowance";
			definition = "Underlying is an emission allowance.";
			owner_lazy = () -> UnderlyingTypeV3Code.mmObject();
			codeName = "EMAL";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UnderlyingTypeV3Code";
				definition = "Specifies the underlying financial instrument.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnderlyingTypeV3Code.Basket, com.tools20022.repository.codeset.UnderlyingTypeV3Code.Bond, com.tools20022.repository.codeset.UnderlyingTypeV3Code.BondFuture,
						com.tools20022.repository.codeset.UnderlyingTypeV3Code.Commodity, com.tools20022.repository.codeset.UnderlyingTypeV3Code.Currency, com.tools20022.repository.codeset.UnderlyingTypeV3Code.DividendIndex,
						com.tools20022.repository.codeset.UnderlyingTypeV3Code.Equity, com.tools20022.repository.codeset.UnderlyingTypeV3Code.ExchangeTradedFund, com.tools20022.repository.codeset.UnderlyingTypeV3Code.Future,
						com.tools20022.repository.codeset.UnderlyingTypeV3Code.FutureOnEquity, com.tools20022.repository.codeset.UnderlyingTypeV3Code.Index, com.tools20022.repository.codeset.UnderlyingTypeV3Code.InterestRate,
						com.tools20022.repository.codeset.UnderlyingTypeV3Code.Option, com.tools20022.repository.codeset.UnderlyingTypeV3Code.OptionOnEquity, com.tools20022.repository.codeset.UnderlyingTypeV3Code.Other,
						com.tools20022.repository.codeset.UnderlyingTypeV3Code.PreciousMetal, com.tools20022.repository.codeset.UnderlyingTypeV3Code.Share, com.tools20022.repository.codeset.UnderlyingTypeV3Code.StockDividend,
						com.tools20022.repository.codeset.UnderlyingTypeV3Code.StockIndex, com.tools20022.repository.codeset.UnderlyingTypeV3Code.Swap, com.tools20022.repository.codeset.UnderlyingTypeV3Code.VolatilityIndex,
						com.tools20022.repository.codeset.UnderlyingTypeV3Code.InterestRateFutureFRA, com.tools20022.repository.codeset.UnderlyingTypeV3Code.EmissionAllowance);
				derivation_lazy = () -> Arrays.asList(UnderlyingInterestRateType3Code.mmObject(), UnderlyingContractForDifferenceType3Code.mmObject(), UnderlyingEquityType6Code.mmObject(), UnderlyingEquityType5Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}