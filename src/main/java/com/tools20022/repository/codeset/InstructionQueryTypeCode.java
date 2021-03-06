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
import com.tools20022.repository.codeset.InstructionQueryTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of instruction queried.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionQueryTypeCode#SettlementInstruction
 * InstructionQueryTypeCode.SettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionQueryTypeCode#IntraPositionMovement
 * InstructionQueryTypeCode.IntraPositionMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionQueryTypeCode#SettlementAndIntraPosition
 * InstructionQueryTypeCode.SettlementAndIntraPosition}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.InstructionQueryType1Code
 * InstructionQueryType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionQueryTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of instruction queried."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SETT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InstructionQueryTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Query is performed on settlement transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionQueryTypeCode
	 * InstructionQueryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query is performed on settlement transactions."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InstructionQueryTypeCode SettlementInstruction = new InstructionQueryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementInstruction";
			definition = "Query is performed on settlement transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionQueryTypeCode.mmObject();
			codeName = "SETT";
		}
	};
	/**
	 * Query is performed on intra-position movements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionQueryTypeCode
	 * InstructionQueryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPOS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraPositionMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Query is performed on intra-position movements."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InstructionQueryTypeCode IntraPositionMovement = new InstructionQueryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraPositionMovement";
			definition = "Query is performed on intra-position movements.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionQueryTypeCode.mmObject();
			codeName = "IPOS";
		}
	};
	/**
	 * Query is performed on both settlement transactions and intra-position
	 * movements.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionQueryTypeCode
	 * InstructionQueryTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOTH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAndIntraPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Query is performed on both settlement transactions and intra-position movements."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final InstructionQueryTypeCode SettlementAndIntraPosition = new InstructionQueryTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAndIntraPosition";
			definition = "Query is performed on both settlement transactions and intra-position movements.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionQueryTypeCode.mmObject();
			codeName = "BOTH";
		}
	};
	final static private LinkedHashMap<String, InstructionQueryTypeCode> codesByName = new LinkedHashMap<>();

	protected InstructionQueryTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SETT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionQueryTypeCode";
				definition = "Specifies the type of instruction queried.";
				derivation_lazy = () -> Arrays.asList(InstructionQueryType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstructionQueryTypeCode.SettlementInstruction, com.tools20022.repository.codeset.InstructionQueryTypeCode.IntraPositionMovement,
						com.tools20022.repository.codeset.InstructionQueryTypeCode.SettlementAndIntraPosition);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SettlementInstruction.getCodeName().get(), SettlementInstruction);
		codesByName.put(IntraPositionMovement.getCodeName().get(), IntraPositionMovement);
		codesByName.put(SettlementAndIntraPosition.getCodeName().get(), SettlementAndIntraPosition);
	}

	public static InstructionQueryTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InstructionQueryTypeCode[] values() {
		InstructionQueryTypeCode[] values = new InstructionQueryTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InstructionQueryTypeCode> {
		@Override
		public InstructionQueryTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InstructionQueryTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}