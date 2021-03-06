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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.PersonIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericIdentification81;
import com.tools20022.repository.msg.IndividualPerson30;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of formats for the identification of an individual person.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification2Choice#mmIdentificationNumber
 * IndividualPersonIdentification2Choice.mmIdentificationNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification2Choice#mmPersonName
 * IndividualPersonIdentification2Choice.mmPersonName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PersonIdentification
 * PersonIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IndividualPersonIdentification2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice of formats for the identification of an individual person."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentificationChoice
 * IndividualPersonIdentificationChoice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IndividualPersonIdentification2Choice", propOrder = {"identificationNumber", "personName"})
public class IndividualPersonIdentification2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IdNb", required = true)
	protected GenericIdentification81 identificationNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification81
	 * GenericIdentification81}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification2Choice
	 * IndividualPersonIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IdNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IdentificationNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a party, such as a tax or social security identifier."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentificationChoice#mmIdentificationNumber
	 * IndividualPersonIdentificationChoice.mmIdentificationNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualPersonIdentification2Choice, GenericIdentification81> mmIdentificationNumber = new MMMessageAssociationEnd<IndividualPersonIdentification2Choice, GenericIdentification81>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.IndividualPersonIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "IdNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IdentificationNumber";
			definition = "Identification of a party, such as a tax or social security identifier.";
			previousVersion_lazy = () -> IndividualPersonIdentificationChoice.mmIdentificationNumber;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericIdentification81.mmObject();
		}

		@Override
		public GenericIdentification81 getValue(IndividualPersonIdentification2Choice obj) {
			return obj.getIdentificationNumber();
		}

		@Override
		public void setValue(IndividualPersonIdentification2Choice obj, GenericIdentification81 value) {
			obj.setIdentificationNumber(value);
		}
	};
	@XmlElement(name = "PrsnNm", required = true)
	protected IndividualPerson30 personName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson30
	 * IndividualPerson30}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonIdentification#mmPersonName
	 * PersonIdentification.mmPersonName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentification2Choice
	 * IndividualPersonIdentification2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrsnNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PersonName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person')."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.IndividualPersonIdentificationChoice#mmPersonName
	 * IndividualPersonIdentificationChoice.mmPersonName}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualPersonIdentification2Choice, IndividualPerson30> mmPersonName = new MMMessageAssociationEnd<IndividualPersonIdentification2Choice, IndividualPerson30>() {
		{
			businessElementTrace_lazy = () -> PersonIdentification.mmPersonName;
			componentContext_lazy = () -> com.tools20022.repository.choice.IndividualPersonIdentification2Choice.mmObject();
			isDerived = false;
			xmlTag = "PrsnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PersonName";
			definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
			previousVersion_lazy = () -> IndividualPersonIdentificationChoice.mmPersonName;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> IndividualPerson30.mmObject();
		}

		@Override
		public IndividualPerson30 getValue(IndividualPersonIdentification2Choice obj) {
			return obj.getPersonName();
		}

		@Override
		public void setValue(IndividualPersonIdentification2Choice obj, IndividualPerson30 value) {
			obj.setPersonName(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.IndividualPersonIdentification2Choice.mmIdentificationNumber, com.tools20022.repository.choice.IndividualPersonIdentification2Choice.mmPersonName);
				trace_lazy = () -> PersonIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "IndividualPersonIdentification2Choice";
				definition = "Choice of formats for the identification of an individual person.";
				previousVersion_lazy = () -> IndividualPersonIdentificationChoice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public GenericIdentification81 getIdentificationNumber() {
		return identificationNumber;
	}

	public IndividualPersonIdentification2Choice setIdentificationNumber(GenericIdentification81 identificationNumber) {
		this.identificationNumber = Objects.requireNonNull(identificationNumber);
		return this;
	}

	public IndividualPerson30 getPersonName() {
		return personName;
	}

	public IndividualPersonIdentification2Choice setPersonName(IndividualPerson30 personName) {
		this.personName = Objects.requireNonNull(personName);
		return this;
	}
}