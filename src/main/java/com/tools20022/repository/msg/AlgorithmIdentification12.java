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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.Algorithm8Code;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Parameter5;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Mask generator function cryptographic algorithm and parameters.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification12#mmAlgorithm
 * AlgorithmIdentification12.mmAlgorithm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification12#mmParameter
 * AlgorithmIdentification12.mmParameter}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AlgorithmIdentification12"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Mask generator function cryptographic algorithm and parameters."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AlgorithmIdentification18
 * AlgorithmIdentification18}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification8
 * AlgorithmIdentification8}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AlgorithmIdentification12", propOrder = {"algorithm", "parameter"})
public class AlgorithmIdentification12 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Algo", required = true)
	protected Algorithm8Code algorithm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Algorithm8Code
	 * Algorithm8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification12
	 * AlgorithmIdentification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Algo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Algorithm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mask generator function cryptographic algorithm."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification18#mmAlgorithm
	 * AlgorithmIdentification18.mmAlgorithm}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification8#mmAlgorithm
	 * AlgorithmIdentification8.mmAlgorithm}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AlgorithmIdentification12, Algorithm8Code> mmAlgorithm = new MMMessageAttribute<AlgorithmIdentification12, Algorithm8Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AlgorithmIdentification12.mmObject();
			isDerived = false;
			xmlTag = "Algo";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Algorithm";
			definition = "Mask generator function cryptographic algorithm.";
			nextVersions_lazy = () -> Arrays.asList(AlgorithmIdentification18.mmAlgorithm);
			previousVersion_lazy = () -> AlgorithmIdentification8.mmAlgorithm;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Algorithm8Code.mmObject();
		}

		@Override
		public Algorithm8Code getValue(AlgorithmIdentification12 obj) {
			return obj.getAlgorithm();
		}

		@Override
		public void setValue(AlgorithmIdentification12 obj, Algorithm8Code value) {
			obj.setAlgorithm(value);
		}
	};
	@XmlElement(name = "Param")
	protected Parameter5 parameter;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Parameter5 Parameter5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification12
	 * AlgorithmIdentification12}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Param"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Parameter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters associated to the mask generator function cryptographic algorithm."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification18#mmParameter
	 * AlgorithmIdentification18.mmParameter}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AlgorithmIdentification8#mmParameter
	 * AlgorithmIdentification8.mmParameter}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AlgorithmIdentification12, Optional<Parameter5>> mmParameter = new MMMessageAssociationEnd<AlgorithmIdentification12, Optional<Parameter5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AlgorithmIdentification12.mmObject();
			isDerived = false;
			xmlTag = "Param";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Parameter";
			definition = "Parameters associated to the mask generator function cryptographic algorithm.";
			nextVersions_lazy = () -> Arrays.asList(AlgorithmIdentification18.mmParameter);
			previousVersion_lazy = () -> AlgorithmIdentification8.mmParameter;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Parameter5.mmObject();
		}

		@Override
		public Optional<Parameter5> getValue(AlgorithmIdentification12 obj) {
			return obj.getParameter();
		}

		@Override
		public void setValue(AlgorithmIdentification12 obj, Optional<Parameter5> value) {
			obj.setParameter(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AlgorithmIdentification12.mmAlgorithm, com.tools20022.repository.msg.AlgorithmIdentification12.mmParameter);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AlgorithmIdentification12";
				definition = "Mask generator function cryptographic algorithm and parameters.";
				nextVersions_lazy = () -> Arrays.asList(AlgorithmIdentification18.mmObject());
				previousVersion_lazy = () -> AlgorithmIdentification8.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Algorithm8Code getAlgorithm() {
		return algorithm;
	}

	public AlgorithmIdentification12 setAlgorithm(Algorithm8Code algorithm) {
		this.algorithm = Objects.requireNonNull(algorithm);
		return this;
	}

	public Optional<Parameter5> getParameter() {
		return parameter == null ? Optional.empty() : Optional.of(parameter);
	}

	public AlgorithmIdentification12 setParameter(Parameter5 parameter) {
		this.parameter = parameter;
		return this;
	}
}