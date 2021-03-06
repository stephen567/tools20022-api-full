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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ProxyType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of proxy person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ProxyType2Code#Chairman
 * ProxyType2Code.Chairman}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProxyType2Code#Discretionary
 * ProxyType2Code.Discretionary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProxyType2Code#SecurityHolder
 * ProxyType2Code.SecurityHolder}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ProxyTypeCode ProxyTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProxyType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of proxy person."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CHRM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProxyType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProxyType2Code
	 * ProxyType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Chairman"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProxyType2Code Chairman = new ProxyType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Chairman";
			owner_lazy = () -> com.tools20022.repository.codeset.ProxyType2Code.mmObject();
			codeName = ProxyTypeCode.Chairman.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProxyType2Code
	 * ProxyType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discretionary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProxyType2Code Discretionary = new ProxyType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discretionary";
			owner_lazy = () -> com.tools20022.repository.codeset.ProxyType2Code.mmObject();
			codeName = ProxyTypeCode.Discretionary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProxyType2Code
	 * ProxyType2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityHolder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ProxyType2Code SecurityHolder = new ProxyType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityHolder";
			owner_lazy = () -> com.tools20022.repository.codeset.ProxyType2Code.mmObject();
			codeName = ProxyTypeCode.SecurityHolder.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ProxyType2Code> codesByName = new LinkedHashMap<>();

	protected ProxyType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CHRM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProxyType2Code";
				definition = "Specifies the type of proxy person.";
				trace_lazy = () -> ProxyTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProxyType2Code.Chairman, com.tools20022.repository.codeset.ProxyType2Code.Discretionary, com.tools20022.repository.codeset.ProxyType2Code.SecurityHolder);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Chairman.getCodeName().get(), Chairman);
		codesByName.put(Discretionary.getCodeName().get(), Discretionary);
		codesByName.put(SecurityHolder.getCodeName().get(), SecurityHolder);
	}

	public static ProxyType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProxyType2Code[] values() {
		ProxyType2Code[] values = new ProxyType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProxyType2Code> {
		@Override
		public ProxyType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProxyType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}