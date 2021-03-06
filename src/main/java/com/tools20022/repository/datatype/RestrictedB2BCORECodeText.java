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

import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.metamodel.MMText;
import com.tools20022.repository.GeneratedRepository;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * EPC Technical validation subset restricted to B2B or CORE code: - CORE: Used
 * to indicate that the SEPA Core Direct Debit Scheme rules apply. - B2B: Used
 * to indicate that the SEPA Business-to-Business Direct Debit Scheme rules
 * apply.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMString#getPattern pattern} =
 * "B2B|CORE"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RestrictedB2BCORECodeText"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "EPC Technical validation subset restricted to B2B or CORE code:\n- CORE: Used to indicate that the SEPA Core Direct Debit Scheme rules apply.\n- B2B: Used to indicate that the SEPA Business-to-Business Direct Debit Scheme rules apply."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType
public class RestrictedB2BCORECodeText {

	final static private AtomicReference<MMText> mmObject_lazy = new AtomicReference<>();
	@XmlValue
	protected String value;

	final static public MMText mmObject() {
		mmObject_lazy.compareAndSet(null, new MMText() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "RestrictedB2BCORECodeText";
				definition = "EPC Technical validation subset restricted to B2B or CORE code:\n- CORE: Used to indicate that the SEPA Core Direct Debit Scheme rules apply.\n- B2B: Used to indicate that the SEPA Business-to-Business Direct Debit Scheme rules apply.";
				pattern = "B2B|CORE";
			}
		});
		return mmObject_lazy.get();
	}

	public RestrictedB2BCORECodeText() {
	}

	public RestrictedB2BCORECodeText(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value == null ? null : value.toString();
	}
}