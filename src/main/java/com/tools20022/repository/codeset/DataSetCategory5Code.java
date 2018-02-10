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
import com.tools20022.repository.codeset.DataSetCategory5Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Maintenance services provided by a terminal manager.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#AcquirerParameters
 * DataSetCategory5Code.AcquirerParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#ApplicationParameters
 * DataSetCategory5Code.ApplicationParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#MasterTerminalManager
 * DataSetCategory5Code.MasterTerminalManager}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#MerchantParameters
 * DataSetCategory5Code.MerchantParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#Monitoring
 * DataSetCategory5Code.Monitoring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#SecurityParameters
 * DataSetCategory5Code.SecurityParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#SoftwareModule
 * DataSetCategory5Code.SoftwareModule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code#TerminalParameters
 * DataSetCategory5Code.TerminalParameters}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DataSetCategoryCode
 * DataSetCategoryCode}</li>
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
 * "DataSetCategory5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Maintenance services provided by a terminal manager."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DataSetCategory10Code
 * DataSetCategory10Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DataSetCategory5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
	 * DataSetCategory5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#AcquirerParameters
	 * DataSetCategory10Code.AcquirerParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory5Code AcquirerParameters = new DataSetCategory5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory10Code.AcquirerParameters);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory5Code.mmObject();
			codeName = DataSetCategoryCode.AcquirerParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
	 * DataSetCategory5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#ApplicationParameters
	 * DataSetCategory10Code.ApplicationParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory5Code ApplicationParameters = new DataSetCategory5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory10Code.ApplicationParameters);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory5Code.mmObject();
			codeName = DataSetCategoryCode.ApplicationParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
	 * DataSetCategory5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterTerminalManager"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#MasterTerminalManager
	 * DataSetCategory10Code.MasterTerminalManager}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory5Code MasterTerminalManager = new DataSetCategory5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterTerminalManager";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory10Code.MasterTerminalManager);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory5Code.mmObject();
			codeName = DataSetCategoryCode.MasterTerminalManager.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
	 * DataSetCategory5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MerchantParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#MerchantParameters
	 * DataSetCategory10Code.MerchantParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory5Code MerchantParameters = new DataSetCategory5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MerchantParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory10Code.MerchantParameters);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory5Code.mmObject();
			codeName = DataSetCategoryCode.MerchantParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
	 * DataSetCategory5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monitoring"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#Monitoring
	 * DataSetCategory10Code.Monitoring}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory5Code Monitoring = new DataSetCategory5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monitoring";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory10Code.Monitoring);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory5Code.mmObject();
			codeName = DataSetCategoryCode.Monitoring.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
	 * DataSetCategory5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#SecurityParameters
	 * DataSetCategory10Code.SecurityParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory5Code SecurityParameters = new DataSetCategory5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory10Code.SecurityParameters);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory5Code.mmObject();
			codeName = DataSetCategoryCode.SecurityParameters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
	 * DataSetCategory5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftwareModule"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#SoftwareModule
	 * DataSetCategory10Code.SoftwareModule}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory5Code SoftwareModule = new DataSetCategory5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftwareModule";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory10Code.SoftwareModule);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory5Code.mmObject();
			codeName = DataSetCategoryCode.SoftwareModule.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory5Code
	 * DataSetCategory5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalParameters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory10Code#TerminalParameters
	 * DataSetCategory10Code.TerminalParameters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final DataSetCategory5Code TerminalParameters = new DataSetCategory5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalParameters";
			nextVersions_lazy = () -> Arrays.asList(DataSetCategory10Code.TerminalParameters);
			owner_lazy = () -> com.tools20022.repository.codeset.DataSetCategory5Code.mmObject();
			codeName = DataSetCategoryCode.TerminalParameters.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DataSetCategory5Code> codesByName = new LinkedHashMap<>();

	protected DataSetCategory5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataSetCategory5Code";
				definition = "Maintenance services provided by a terminal manager.";
				nextVersions_lazy = () -> Arrays.asList(DataSetCategory10Code.mmObject());
				trace_lazy = () -> DataSetCategoryCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DataSetCategory5Code.AcquirerParameters, com.tools20022.repository.codeset.DataSetCategory5Code.ApplicationParameters,
						com.tools20022.repository.codeset.DataSetCategory5Code.MasterTerminalManager, com.tools20022.repository.codeset.DataSetCategory5Code.MerchantParameters,
						com.tools20022.repository.codeset.DataSetCategory5Code.Monitoring, com.tools20022.repository.codeset.DataSetCategory5Code.SecurityParameters, com.tools20022.repository.codeset.DataSetCategory5Code.SoftwareModule,
						com.tools20022.repository.codeset.DataSetCategory5Code.TerminalParameters);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcquirerParameters.getCodeName().get(), AcquirerParameters);
		codesByName.put(ApplicationParameters.getCodeName().get(), ApplicationParameters);
		codesByName.put(MasterTerminalManager.getCodeName().get(), MasterTerminalManager);
		codesByName.put(MerchantParameters.getCodeName().get(), MerchantParameters);
		codesByName.put(Monitoring.getCodeName().get(), Monitoring);
		codesByName.put(SecurityParameters.getCodeName().get(), SecurityParameters);
		codesByName.put(SoftwareModule.getCodeName().get(), SoftwareModule);
		codesByName.put(TerminalParameters.getCodeName().get(), TerminalParameters);
	}

	public static DataSetCategory5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DataSetCategory5Code[] values() {
		DataSetCategory5Code[] values = new DataSetCategory5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DataSetCategory5Code> {
		@Override
		public DataSetCategory5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DataSetCategory5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}