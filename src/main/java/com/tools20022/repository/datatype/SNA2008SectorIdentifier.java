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

package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMIdentifierSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.SNA2008SectorIdentifier.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * System of National Accounts (SNA) Sector. Hierarchical classification of the
 * sectors, as defined in the System of National Accounts 2008, as published by
 * the United Nations.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMIdentifierSet#getIdentificationScheme
 * identificationScheme} = "United Nations SNA 2008"</li>
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
 * "SNA2008SectorIdentifier"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "System of National Accounts (SNA) Sector. Hierarchical classification of the sectors, as defined in the System of National Accounts 2008, as published by the United Nations."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SNA2008SectorIdentifier {

	final static private AtomicReference<MMIdentifierSet> mmObject_lazy = new AtomicReference<>();
	protected String value;

	final static public MMIdentifierSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMIdentifierSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SNA2008SectorIdentifier";
				definition = "System of National Accounts (SNA) Sector. Hierarchical classification of the sectors, as defined in the System of National Accounts 2008, as published by the United Nations.";
				identificationScheme = "United Nations SNA 2008";
			}
		});
		return mmObject_lazy.get();
	}

	public SNA2008SectorIdentifier(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SNA2008SectorIdentifier> {
		@Override
		public SNA2008SectorIdentifier unmarshal(String value) {
			return new SNA2008SectorIdentifier(value);
		}

		@Override
		public String marshal(SNA2008SectorIdentifier typedData) {
			return typedData.value;
		}
	}
}