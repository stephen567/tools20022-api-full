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
import com.tools20022.repository.codeset.CustodianRecordCompletenessType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the state of details of the composite record on the system.
 * Applicable to custodian service only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustodianRecordCompletenessType1Code#Complete
 * CustodianRecordCompletenessType1Code.Complete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustodianRecordCompletenessType1Code#Incomplete
 * CustodianRecordCompletenessType1Code.Incomplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustodianRecordCompletenessType1Code#ConditionallyComplete
 * CustodianRecordCompletenessType1Code.ConditionallyComplete}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CustodianRecordCompletenessTypeCode
 * CustodianRecordCompletenessTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"COMP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustodianRecordCompletenessType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the state of details of the composite record on the system. Applicable to custodian service only."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CustodianRecordCompletenessType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianRecordCompletenessType1Code
	 * CustodianRecordCompletenessType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * </ul>
	 */
	public static final CustodianRecordCompletenessType1Code Complete = new CustodianRecordCompletenessType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			owner_lazy = () -> com.tools20022.repository.codeset.CustodianRecordCompletenessType1Code.mmObject();
			codeName = CustodianRecordCompletenessTypeCode.Complete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianRecordCompletenessType1Code
	 * CustodianRecordCompletenessType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incomplete"</li>
	 * </ul>
	 */
	public static final CustodianRecordCompletenessType1Code Incomplete = new CustodianRecordCompletenessType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incomplete";
			owner_lazy = () -> com.tools20022.repository.codeset.CustodianRecordCompletenessType1Code.mmObject();
			codeName = CustodianRecordCompletenessTypeCode.Incomplete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustodianRecordCompletenessType1Code
	 * CustodianRecordCompletenessType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionallyComplete"</li>
	 * </ul>
	 */
	public static final CustodianRecordCompletenessType1Code ConditionallyComplete = new CustodianRecordCompletenessType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionallyComplete";
			owner_lazy = () -> com.tools20022.repository.codeset.CustodianRecordCompletenessType1Code.mmObject();
			codeName = CustodianRecordCompletenessTypeCode.ConditionallyComplete.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CustodianRecordCompletenessType1Code> codesByName = new LinkedHashMap<>();

	protected CustodianRecordCompletenessType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("COMP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustodianRecordCompletenessType1Code";
				definition = "Specifies the state of details of the composite record on the system. Applicable to custodian service only.";
				trace_lazy = () -> CustodianRecordCompletenessTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CustodianRecordCompletenessType1Code.Complete, com.tools20022.repository.codeset.CustodianRecordCompletenessType1Code.Incomplete,
						com.tools20022.repository.codeset.CustodianRecordCompletenessType1Code.ConditionallyComplete);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Complete.getCodeName().get(), Complete);
		codesByName.put(Incomplete.getCodeName().get(), Incomplete);
		codesByName.put(ConditionallyComplete.getCodeName().get(), ConditionallyComplete);
	}

	public static CustodianRecordCompletenessType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CustodianRecordCompletenessType1Code[] values() {
		CustodianRecordCompletenessType1Code[] values = new CustodianRecordCompletenessType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CustodianRecordCompletenessType1Code> {
		@Override
		public CustodianRecordCompletenessType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CustodianRecordCompletenessType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}