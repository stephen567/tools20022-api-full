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
import com.tools20022.repository.codeset.CancellationProcessCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Configuration of the exchanges to perform the cancellation of a payment
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CancellationProcessCode
 * CancellationProcessCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcess1Code#Advice
 * CancellationProcess1Code.Advice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcess1Code#NotAllowed
 * CancellationProcess1Code.NotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationProcess1Code#Request
 * CancellationProcess1Code.Request}</li>
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
 * <li>"ADVC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancellationProcess1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Configuration of the exchanges to perform the cancellation of a payment transaction."
 * </li>
 * </ul>
 */
public class CancellationProcess1Code extends CancellationProcessCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcess1Code
	 * CancellationProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Advice"</li>
	 * </ul>
	 */
	public static final MMCode Advice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Advice";
			owner_lazy = () -> CancellationProcess1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcess1Code
	 * CancellationProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAllowed"</li>
	 * </ul>
	 */
	public static final MMCode NotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAllowed";
			owner_lazy = () -> CancellationProcess1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationProcess1Code
	 * CancellationProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Request"</li>
	 * </ul>
	 */
	public static final MMCode Request = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Request";
			owner_lazy = () -> CancellationProcess1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("ADVC");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CancellationProcess1Code";
				definition = "Configuration of the exchanges to perform the cancellation of a payment transaction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancellationProcess1Code.Advice, com.tools20022.repository.codeset.CancellationProcess1Code.NotAllowed,
						com.tools20022.repository.codeset.CancellationProcess1Code.Request);
				trace_lazy = () -> CancellationProcessCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}