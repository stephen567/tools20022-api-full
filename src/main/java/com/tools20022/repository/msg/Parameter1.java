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
import com.tools20022.repository.datatype.Max500Binary;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters associated to a cryptographic algorithm.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Parameter1#mmInitialisationVector
 * Parameter1.mmInitialisationVector}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Parameter1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters associated to a cryptographic algorithm."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Parameter2 Parameter2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Parameter3 Parameter3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Parameter7 Parameter7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Parameter6 Parameter6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Parameter1", propOrder = "initialisationVector")
public class Parameter1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InitlstnVctr")
	protected Max500Binary initialisationVector;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max500Binary Max500Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Parameter1
	 * Parameter1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitlstnVctr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitialisationVector"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Initialisation vector of a cipher block chaining (CBC) mode encryption."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Parameter7#mmInitialisationVector
	 * Parameter7.mmInitialisationVector}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Parameter6#mmInitialisationVector
	 * Parameter6.mmInitialisationVector}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Parameter1, Optional<Max500Binary>> mmInitialisationVector = new MMMessageAttribute<Parameter1, Optional<Max500Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Parameter1.mmObject();
			isDerived = false;
			xmlTag = "InitlstnVctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialisationVector";
			definition = "Initialisation vector of a cipher block chaining (CBC) mode encryption.";
			nextVersions_lazy = () -> Arrays.asList(Parameter7.mmInitialisationVector, Parameter6.mmInitialisationVector);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Binary.mmObject();
		}

		@Override
		public Optional<Max500Binary> getValue(Parameter1 obj) {
			return obj.getInitialisationVector();
		}

		@Override
		public void setValue(Parameter1 obj, Optional<Max500Binary> value) {
			obj.setInitialisationVector(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Parameter1.mmInitialisationVector);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Parameter1";
				definition = "Parameters associated to a cryptographic algorithm.";
				nextVersions_lazy = () -> Arrays.asList(Parameter2.mmObject(), Parameter3.mmObject(), Parameter7.mmObject(), Parameter6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max500Binary> getInitialisationVector() {
		return initialisationVector == null ? Optional.empty() : Optional.of(initialisationVector);
	}

	public Parameter1 setInitialisationVector(Max500Binary initialisationVector) {
		this.initialisationVector = initialisationVector;
		return this;
	}
}