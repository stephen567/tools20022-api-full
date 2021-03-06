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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max5000Binary;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the originator. It is present only if required by
 * the key management algorithm.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginatorInformation1#mmCertificate
 * OriginatorInformation1.mmCertificate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OriginatorInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about the originator. It is present only if required by the key management algorithm."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "OriginatorInformation1", propOrder = "certificate")
public class OriginatorInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Cert")
	protected List<Max5000Binary> certificate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max5000Binary
	 * Max5000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginatorInformation1
	 * OriginatorInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cert"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "It may contain originator certificates associated with several different key management algorithms."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<OriginatorInformation1, List<Max5000Binary>> mmCertificate = new MMMessageAttribute<OriginatorInformation1, List<Max5000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.OriginatorInformation1.mmObject();
			isDerived = false;
			xmlTag = "Cert";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificate";
			definition = "It may contain originator certificates associated with several different key management algorithms.";
			minOccurs = 0;
			simpleType_lazy = () -> Max5000Binary.mmObject();
		}

		@Override
		public List<Max5000Binary> getValue(OriginatorInformation1 obj) {
			return obj.getCertificate();
		}

		@Override
		public void setValue(OriginatorInformation1 obj, List<Max5000Binary> value) {
			obj.setCertificate(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.OriginatorInformation1.mmCertificate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginatorInformation1";
				definition = "Provides information about the originator. It is present only if required by the key management algorithm.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max5000Binary> getCertificate() {
		return certificate == null ? certificate = new ArrayList<>() : certificate;
	}

	public OriginatorInformation1 setCertificate(List<Max5000Binary> certificate) {
		this.certificate = Objects.requireNonNull(certificate);
		return this;
	}
}