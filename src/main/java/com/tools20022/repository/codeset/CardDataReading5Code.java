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
import com.tools20022.repository.codeset.CardDataReadingCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of reading of the card data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardDataReadingCode
 * CardDataReadingCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CardDataReading5Code#Tag
 * CardDataReading5Code.Tag}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code#Physical
 * CardDataReading5Code.Physical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code#BarCode
 * CardDataReading5Code.BarCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code#MagneticStripe
 * CardDataReading5Code.MagneticStripe}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.CardDataReading5Code#ICC
 * CardDataReading5Code.ICC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code#AccountData
 * CardDataReading5Code.AccountData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code#ProximityReader
 * CardDataReading5Code.ProximityReader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code#EMVProximityReader
 * CardDataReading5Code.EMVProximityReader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code#CardOnFile
 * CardDataReading5Code.CardOnFile}</li>
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
 * <li>"TAGC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardDataReading5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of reading of the card data."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code
 * CardDataReading1Code}</li>
 * </ul>
 */
public class CardDataReading5Code extends CardDataReadingCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code
	 * CardDataReading5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#Tag
	 * CardDataReading1Code.Tag}</li>
	 * </ul>
	 */
	public static final MMCode Tag = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tag";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.CardDataReading1Code.Tag;
			owner_lazy = () -> CardDataReading5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code
	 * CardDataReading5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Physical"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#Physical
	 * CardDataReading1Code.Physical}</li>
	 * </ul>
	 */
	public static final MMCode Physical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Physical";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.CardDataReading1Code.Physical;
			owner_lazy = () -> CardDataReading5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code
	 * CardDataReading5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BarCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#BarCode
	 * CardDataReading1Code.BarCode}</li>
	 * </ul>
	 */
	public static final MMCode BarCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BarCode";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.CardDataReading1Code.BarCode;
			owner_lazy = () -> CardDataReading5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code
	 * CardDataReading5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MagneticStripe"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#MagneticStripe
	 * CardDataReading1Code.MagneticStripe}</li>
	 * </ul>
	 */
	public static final MMCode MagneticStripe = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MagneticStripe";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.CardDataReading1Code.MagneticStripe;
			owner_lazy = () -> CardDataReading5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code
	 * CardDataReading5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#ICC
	 * CardDataReading1Code.ICC}</li>
	 * </ul>
	 */
	public static final MMCode ICC = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICC";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.CardDataReading1Code.ICC;
			owner_lazy = () -> CardDataReading5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code
	 * CardDataReading5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#AccountData
	 * CardDataReading1Code.AccountData}</li>
	 * </ul>
	 */
	public static final MMCode AccountData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountData";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.CardDataReading1Code.AccountData;
			owner_lazy = () -> CardDataReading5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code
	 * CardDataReading5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProximityReader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#ProximityReader
	 * CardDataReading1Code.ProximityReader}</li>
	 * </ul>
	 */
	public static final MMCode ProximityReader = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProximityReader";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.CardDataReading1Code.ProximityReader;
			owner_lazy = () -> CardDataReading5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code
	 * CardDataReading5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EMVProximityReader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading1Code#EMVProximityReader
	 * CardDataReading1Code.EMVProximityReader}</li>
	 * </ul>
	 */
	public static final MMCode EMVProximityReader = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EMVProximityReader";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.CardDataReading1Code.EMVProximityReader;
			owner_lazy = () -> CardDataReading5Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardDataReading5Code
	 * CardDataReading5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardOnFile"</li>
	 * </ul>
	 */
	public static final MMCode CardOnFile = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardOnFile";
			owner_lazy = () -> CardDataReading5Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("TAGC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardDataReading5Code";
				definition = "Type of reading of the card data.";
				previousVersion_lazy = () -> CardDataReading1Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardDataReading5Code.Tag, com.tools20022.repository.codeset.CardDataReading5Code.Physical, com.tools20022.repository.codeset.CardDataReading5Code.BarCode,
						com.tools20022.repository.codeset.CardDataReading5Code.MagneticStripe, com.tools20022.repository.codeset.CardDataReading5Code.ICC, com.tools20022.repository.codeset.CardDataReading5Code.AccountData,
						com.tools20022.repository.codeset.CardDataReading5Code.ProximityReader, com.tools20022.repository.codeset.CardDataReading5Code.EMVProximityReader, com.tools20022.repository.codeset.CardDataReading5Code.CardOnFile);
				trace_lazy = () -> CardDataReadingCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}