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
import com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code;
import com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code;
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
 * Indicates the reason for the UnableToApply. It can be missing and/or
 * incorrect information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MissingOrIncorrectInformation#mmMissingInformation
 * MissingOrIncorrectInformation.mmMissingInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MissingOrIncorrectInformation#mmIncorrectInformation
 * MissingOrIncorrectInformation.mmIncorrectInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MissingOrIncorrectInformation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the reason for the UnableToApply. It can be missing and/or incorrect information."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MissingOrIncorrectInformation", propOrder = {"missingInformation", "incorrectInformation"})
public class MissingOrIncorrectInformation {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MssngInf")
	protected List<UnableToApplyMissingInfo1Code> missingInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyMissingInfo1Code
	 * UnableToApplyMissingInfo1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MissingOrIncorrectInformation
	 * MissingOrIncorrectInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MssngInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the missing information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MissingOrIncorrectInformation, List<UnableToApplyMissingInfo1Code>> mmMissingInformation = new MMMessageAttribute<MissingOrIncorrectInformation, List<UnableToApplyMissingInfo1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MissingOrIncorrectInformation.mmObject();
			isDerived = false;
			xmlTag = "MssngInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInformation";
			definition = "Indicates the missing information.";
			maxOccurs = 10;
			minOccurs = 0;
			simpleType_lazy = () -> UnableToApplyMissingInfo1Code.mmObject();
		}

		@Override
		public List<UnableToApplyMissingInfo1Code> getValue(MissingOrIncorrectInformation obj) {
			return obj.getMissingInformation();
		}

		@Override
		public void setValue(MissingOrIncorrectInformation obj, List<UnableToApplyMissingInfo1Code> value) {
			obj.setMissingInformation(value);
		}
	};
	@XmlElement(name = "IncrrctInf")
	protected List<UnableToApplyIncorrectInfo1Code> incorrectInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UnableToApplyIncorrectInfo1Code
	 * UnableToApplyIncorrectInfo1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MissingOrIncorrectInformation
	 * MissingOrIncorrectInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncrrctInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the incorrect information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MissingOrIncorrectInformation, List<UnableToApplyIncorrectInfo1Code>> mmIncorrectInformation = new MMMessageAttribute<MissingOrIncorrectInformation, List<UnableToApplyIncorrectInfo1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MissingOrIncorrectInformation.mmObject();
			isDerived = false;
			xmlTag = "IncrrctInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInformation";
			definition = "Indicates the incorrect information.";
			maxOccurs = 10;
			minOccurs = 0;
			simpleType_lazy = () -> UnableToApplyIncorrectInfo1Code.mmObject();
		}

		@Override
		public List<UnableToApplyIncorrectInfo1Code> getValue(MissingOrIncorrectInformation obj) {
			return obj.getIncorrectInformation();
		}

		@Override
		public void setValue(MissingOrIncorrectInformation obj, List<UnableToApplyIncorrectInfo1Code> value) {
			obj.setIncorrectInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MissingOrIncorrectInformation.mmMissingInformation, com.tools20022.repository.msg.MissingOrIncorrectInformation.mmIncorrectInformation);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MissingOrIncorrectInformation";
				definition = "Indicates the reason for the UnableToApply. It can be missing and/or incorrect information.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<UnableToApplyMissingInfo1Code> getMissingInformation() {
		return missingInformation == null ? missingInformation = new ArrayList<>() : missingInformation;
	}

	public MissingOrIncorrectInformation setMissingInformation(List<UnableToApplyMissingInfo1Code> missingInformation) {
		this.missingInformation = Objects.requireNonNull(missingInformation);
		return this;
	}

	public List<UnableToApplyIncorrectInfo1Code> getIncorrectInformation() {
		return incorrectInformation == null ? incorrectInformation = new ArrayList<>() : incorrectInformation;
	}

	public MissingOrIncorrectInformation setIncorrectInformation(List<UnableToApplyIncorrectInfo1Code> incorrectInformation) {
		this.incorrectInformation = Objects.requireNonNull(incorrectInformation);
		return this;
	}
}