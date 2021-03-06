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
import com.tools20022.repository.codeset.RepurchaseType8Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of repurchase transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseType8Code#PrincipalExposureAdjustment
 * RepurchaseType8Code.PrincipalExposureAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseType8Code#RepoContractRollover
 * RepurchaseType8Code.RepoContractRollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseType8Code#RepoRate
 * RepurchaseType8Code.RepoRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RepurchaseType8Code#RepurchaseCall
 * RepurchaseType8Code.RepurchaseCall}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RepurchaseTypeV2Code
 * RepurchaseTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RepurchaseType8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of repurchase transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RepurchaseType8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType8Code
	 * RepurchaseType8Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalExposureAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RepurchaseType8Code PrincipalExposureAdjustment = new RepurchaseType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalExposureAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType8Code.mmObject();
			codeName = RepurchaseTypeV2Code.PrincipalExposureAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType8Code
	 * RepurchaseType8Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoContractRollover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RepurchaseType8Code RepoContractRollover = new RepurchaseType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoContractRollover";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType8Code.mmObject();
			codeName = RepurchaseTypeV2Code.RepoContractRollover.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType8Code
	 * RepurchaseType8Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RepurchaseType8Code RepoRate = new RepurchaseType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoRate";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType8Code.mmObject();
			codeName = RepurchaseTypeV2Code.RepoRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RepurchaseType8Code
	 * RepurchaseType8Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final RepurchaseType8Code RepurchaseCall = new RepurchaseType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseCall";
			owner_lazy = () -> com.tools20022.repository.codeset.RepurchaseType8Code.mmObject();
			codeName = RepurchaseTypeV2Code.RepurchaseCall.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RepurchaseType8Code> codesByName = new LinkedHashMap<>();

	protected RepurchaseType8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RepurchaseType8Code";
				definition = "Specifies the type of repurchase transaction.";
				trace_lazy = () -> RepurchaseTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RepurchaseType8Code.PrincipalExposureAdjustment, com.tools20022.repository.codeset.RepurchaseType8Code.RepoContractRollover,
						com.tools20022.repository.codeset.RepurchaseType8Code.RepoRate, com.tools20022.repository.codeset.RepurchaseType8Code.RepurchaseCall);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PrincipalExposureAdjustment.getCodeName().get(), PrincipalExposureAdjustment);
		codesByName.put(RepoContractRollover.getCodeName().get(), RepoContractRollover);
		codesByName.put(RepoRate.getCodeName().get(), RepoRate);
		codesByName.put(RepurchaseCall.getCodeName().get(), RepurchaseCall);
	}

	public static RepurchaseType8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RepurchaseType8Code[] values() {
		RepurchaseType8Code[] values = new RepurchaseType8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RepurchaseType8Code> {
		@Override
		public RepurchaseType8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RepurchaseType8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}