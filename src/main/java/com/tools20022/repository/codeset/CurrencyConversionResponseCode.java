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
 * Result of a currency conversion request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode#InvalidMerchant
 * CurrencyConversionResponseCode.InvalidMerchant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode#InvalidCard
 * CurrencyConversionResponseCode.InvalidCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode#InvalidProduct
 * CurrencyConversionResponseCode.InvalidProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode#NoRate
 * CurrencyConversionResponseCode.NoRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode#Allowed
 * CurrencyConversionResponseCode.Allowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode#Assumed
 * CurrencyConversionResponseCode.Assumed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode#NotAvailable
 * CurrencyConversionResponseCode.NotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode#InvalidATM
 * CurrencyConversionResponseCode.InvalidATM}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode#InvalidATMManager
 * CurrencyConversionResponseCode.InvalidATMManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode#Restriction
 * CurrencyConversionResponseCode.Restriction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode#Catalogue
 * CurrencyConversionResponseCode.Catalogue}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse1Code
 * CurrencyConversionResponse1Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse2Code
 * CurrencyConversionResponse2Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponse3Code
 * CurrencyConversionResponse3Code}</li>
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
 * "CurrencyConversionResponseCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Result of a currency conversion request."</li>
 * </ul>
 */
public class CurrencyConversionResponseCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The card acceptor has not been recognised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode
	 * CurrencyConversionResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IMER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMerchant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The card acceptor has not been recognised."</li>
	 * </ul>
	 */
	public static final MMCode InvalidMerchant = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMerchant";
			definition = "The card acceptor has not been recognised.";
			owner_lazy = () -> CurrencyConversionResponseCode.mmObject();
			codeName = "IMER";
		}
	};
	/**
	 * The card is not valid for dynamic currency conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode
	 * CurrencyConversionResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The card is not valid for dynamic currency conversion."</li>
	 * </ul>
	 */
	public static final MMCode InvalidCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCard";
			definition = "The card is not valid for dynamic currency conversion.";
			owner_lazy = () -> CurrencyConversionResponseCode.mmObject();
			codeName = "ICRD";
		}
	};
	/**
	 * Dynamic currency conversion service cannot be offered for this card
	 * product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode
	 * CurrencyConversionResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidProduct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dynamic currency conversion service cannot be offered for this card product."
	 * </li>
	 * </ul>
	 */
	public static final MMCode InvalidProduct = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidProduct";
			definition = "Dynamic currency conversion service cannot be offered for this card product.";
			owner_lazy = () -> CurrencyConversionResponseCode.mmObject();
			codeName = "IPRD";
		}
	};
	/**
	 * Exchange rates are not available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode
	 * CurrencyConversionResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IRAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange rates are not available."</li>
	 * </ul>
	 */
	public static final MMCode NoRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoRate";
			definition = "Exchange rates are not available.";
			owner_lazy = () -> CurrencyConversionResponseCode.mmObject();
			codeName = "IRAT";
		}
	};
	/**
	 * Dynamic currency conversion may be offered to the cardholder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode
	 * CurrencyConversionResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ODCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Allowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dynamic currency conversion may be offered to the cardholder."</li>
	 * </ul>
	 */
	public static final MMCode Allowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Allowed";
			definition = "Dynamic currency conversion may be offered to the cardholder.";
			owner_lazy = () -> CurrencyConversionResponseCode.mmObject();
			codeName = "ODCC";
		}
	};
	/**
	 * Transaction authorised with dynamic currency conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode
	 * CurrencyConversionResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assumed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction authorised with dynamic currency conversion."</li>
	 * </ul>
	 */
	public static final MMCode Assumed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assumed";
			definition = "Transaction authorised with dynamic currency conversion.";
			owner_lazy = () -> CurrencyConversionResponseCode.mmObject();
			codeName = "DCCA";
		}
	};
	/**
	 * Dynamic currency conversion is not available for other reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode
	 * CurrencyConversionResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NDCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dynamic currency conversion is not available for other reason."</li>
	 * </ul>
	 */
	public static final MMCode NotAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailable";
			definition = "Dynamic currency conversion is not available for other reason.";
			owner_lazy = () -> CurrencyConversionResponseCode.mmObject();
			codeName = "NDCC";
		}
	};
	/**
	 * The ATM is not valid for dynamic currency conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode
	 * CurrencyConversionResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidATM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The ATM is not valid for dynamic currency conversion."</li>
	 * </ul>
	 */
	public static final MMCode InvalidATM = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidATM";
			definition = "The ATM is not valid for dynamic currency conversion.";
			owner_lazy = () -> CurrencyConversionResponseCode.mmObject();
			codeName = "IATM";
		}
	};
	/**
	 * The ATM manager is not valid for dynamic currency conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode
	 * CurrencyConversionResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IAMG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidATMManager"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The ATM manager is not valid for dynamic currency conversion."</li>
	 * </ul>
	 */
	public static final MMCode InvalidATMManager = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidATMManager";
			definition = "The ATM manager is not valid for dynamic currency conversion.";
			owner_lazy = () -> CurrencyConversionResponseCode.mmObject();
			codeName = "IAMG";
		}
	};
	/**
	 * Conversion accepted for the requested amount exclusively.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode
	 * CurrencyConversionResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restriction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conversion accepted for the requested amount exclusively."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Restriction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restriction";
			definition = "Conversion accepted for the requested amount exclusively.";
			owner_lazy = () -> CurrencyConversionResponseCode.mmObject();
			codeName = "REST";
		}
	};
	/**
	 * Conversion accepted for a range of amounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyConversionResponseCode
	 * CurrencyConversionResponseCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CATG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Catalogue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conversion accepted for a range of amounts."</li>
	 * </ul>
	 */
	public static final MMCode Catalogue = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Catalogue";
			definition = "Conversion accepted for a range of amounts.";
			owner_lazy = () -> CurrencyConversionResponseCode.mmObject();
			codeName = "CATG";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CurrencyConversionResponseCode";
				definition = "Result of a currency conversion request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CurrencyConversionResponseCode.InvalidMerchant, com.tools20022.repository.codeset.CurrencyConversionResponseCode.InvalidCard,
						com.tools20022.repository.codeset.CurrencyConversionResponseCode.InvalidProduct, com.tools20022.repository.codeset.CurrencyConversionResponseCode.NoRate,
						com.tools20022.repository.codeset.CurrencyConversionResponseCode.Allowed, com.tools20022.repository.codeset.CurrencyConversionResponseCode.Assumed,
						com.tools20022.repository.codeset.CurrencyConversionResponseCode.NotAvailable, com.tools20022.repository.codeset.CurrencyConversionResponseCode.InvalidATM,
						com.tools20022.repository.codeset.CurrencyConversionResponseCode.InvalidATMManager, com.tools20022.repository.codeset.CurrencyConversionResponseCode.Restriction,
						com.tools20022.repository.codeset.CurrencyConversionResponseCode.Catalogue);
				derivation_lazy = () -> Arrays.asList(CurrencyConversionResponse1Code.mmObject(), CurrencyConversionResponse2Code.mmObject(), CurrencyConversionResponse3Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}