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
import com.tools20022.repository.choice.NamePrefix1Choice;
import com.tools20022.repository.choice.PoliticalExposureType1Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.GenderCode;
import com.tools20022.repository.codeset.LanguageCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Human entity, as distinguished from a corporate entity (which is sometimes
 * referred to as an 'artificial person').
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmNamePrefix
 * IndividualPerson24.mmNamePrefix}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson24#mmGivenName
 * IndividualPerson24.mmGivenName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmMiddleName
 * IndividualPerson24.mmMiddleName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson24#mmName
 * IndividualPerson24.mmName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmNameSuffix
 * IndividualPerson24.mmNameSuffix}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson24#mmGender
 * IndividualPerson24.mmGender}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson24#mmLanguage
 * IndividualPerson24.mmLanguage}</li>
 * <li>{@linkplain com.tools20022.repository.msg.IndividualPerson24#mmBirthDate
 * IndividualPerson24.mmBirthDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmCountryOfBirth
 * IndividualPerson24.mmCountryOfBirth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmProvinceOfBirth
 * IndividualPerson24.mmProvinceOfBirth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmCityOfBirth
 * IndividualPerson24.mmCityOfBirth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmProfession
 * IndividualPerson24.mmProfession}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmTaxationCountry
 * IndividualPerson24.mmTaxationCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmCountryAndResidentialStatus
 * IndividualPerson24.mmCountryAndResidentialStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmBusinessFunction
 * IndividualPerson24.mmBusinessFunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmEmployingCompany
 * IndividualPerson24.mmEmployingCompany}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmModifiedPostalAddress
 * IndividualPerson24.mmModifiedPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmModifiedCitizenship
 * IndividualPerson24.mmModifiedCitizenship}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmPrimaryCommunicationAddress
 * IndividualPerson24.mmPrimaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmSecondaryCommunicationAddress
 * IndividualPerson24.mmSecondaryCommunicationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmModifiedOtherIdentification
 * IndividualPerson24.mmModifiedOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmAdditionalRegulatoryInformation
 * IndividualPerson24.mmAdditionalRegulatoryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IndividualPerson24#mmPoliticallyExposedPersonType
 * IndividualPerson24.mmPoliticallyExposedPersonType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Person Person}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "IndividualPerson24"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person')."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.IndividualPerson21
 * IndividualPerson21}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "IndividualPerson24", propOrder = {"namePrefix", "givenName", "middleName", "name", "nameSuffix", "gender", "language", "birthDate", "countryOfBirth", "provinceOfBirth", "cityOfBirth", "profession", "taxationCountry",
		"countryAndResidentialStatus", "businessFunction", "employingCompany", "modifiedPostalAddress", "modifiedCitizenship", "primaryCommunicationAddress", "secondaryCommunicationAddress", "modifiedOtherIdentification",
		"additionalRegulatoryInformation", "politicallyExposedPersonType"})
public class IndividualPerson24 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NmPrfx")
	protected NamePrefix1Choice namePrefix;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.NamePrefix1Choice
	 * NamePrefix1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmNamePrefix
	 * PersonName.mmNamePrefix}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmPrfx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NamePrefix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Term used to address a person."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmNamePrefix
	 * IndividualPerson21.mmNamePrefix}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson24, Optional<NamePrefix1Choice>> mmNamePrefix = new MMMessageAttribute<IndividualPerson24, Optional<NamePrefix1Choice>>() {
		{
			businessElementTrace_lazy = () -> PersonName.mmNamePrefix;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "NmPrfx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NamePrefix";
			definition = "Term used to address a person.";
			previousVersion_lazy = () -> IndividualPerson21.mmNamePrefix;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NamePrefix1Choice.mmObject();
		}

		@Override
		public Optional<NamePrefix1Choice> getValue(IndividualPerson24 obj) {
			return obj.getNamePrefix();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Optional<NamePrefix1Choice> value) {
			obj.setNamePrefix(value.orElse(null));
		}
	};
	@XmlElement(name = "GvnNm", required = true)
	protected Max35Text givenName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmGivenName
	 * PersonName.mmGivenName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GvnNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GivenName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First name of a person."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmGivenName
	 * IndividualPerson21.mmGivenName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson24, Max35Text> mmGivenName = new MMMessageAttribute<IndividualPerson24, Max35Text>() {
		{
			businessElementTrace_lazy = () -> PersonName.mmGivenName;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "GvnNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GivenName";
			definition = "First name of a person.";
			previousVersion_lazy = () -> IndividualPerson21.mmGivenName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(IndividualPerson24 obj) {
			return obj.getGivenName();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Max35Text value) {
			obj.setGivenName(value);
		}
	};
	@XmlElement(name = "MddlNm")
	protected Max35Text middleName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmMiddleName
	 * PersonName.mmMiddleName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MddlNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiddleName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Second name of a person."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmMiddleName
	 * IndividualPerson21.mmMiddleName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson24, Optional<Max35Text>> mmMiddleName = new MMMessageAttribute<IndividualPerson24, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PersonName.mmMiddleName;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "MddlNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiddleName";
			definition = "Second name of a person.";
			previousVersion_lazy = () -> IndividualPerson21.mmMiddleName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IndividualPerson24 obj) {
			return obj.getMiddleName();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Optional<Max35Text> value) {
			obj.setMiddleName(value.orElse(null));
		}
	};
	@XmlElement(name = "Nm", required = true)
	protected Max350Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmBirthName
	 * PersonName.mmBirthName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name by which a party is known and which is usually used to identify that party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmName
	 * IndividualPerson21.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson24, Max350Text> mmName = new MMMessageAttribute<IndividualPerson24, Max350Text>() {
		{
			businessElementTrace_lazy = () -> PersonName.mmBirthName;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			previousVersion_lazy = () -> IndividualPerson21.mmName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(IndividualPerson24 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Max350Text value) {
			obj.setName(value);
		}
	};
	@XmlElement(name = "NmSfx")
	protected Max35Text nameSuffix;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonName#mmNameSuffix
	 * PersonName.mmNameSuffix}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NmSfx"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameSuffix"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information about a person that follows a person's name, for example, qualification such as Doctor of Philosophy (PhD)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmNameSuffix
	 * IndividualPerson21.mmNameSuffix}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson24, Optional<Max35Text>> mmNameSuffix = new MMMessageAttribute<IndividualPerson24, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> PersonName.mmNameSuffix;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "NmSfx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameSuffix";
			definition = "Additional information about a person that follows a person's name, for example, qualification such as Doctor of Philosophy (PhD).";
			previousVersion_lazy = () -> IndividualPerson21.mmNameSuffix;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IndividualPerson24 obj) {
			return obj.getNameSuffix();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Optional<Max35Text> value) {
			obj.setNameSuffix(value.orElse(null));
		}
	};
	@XmlElement(name = "Gndr")
	protected GenderCode gender;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.GenderCode
	 * GenderCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmGender
	 * Person.mmGender}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Gndr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the gender of the person."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmGender
	 * IndividualPerson21.mmGender}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson24, Optional<GenderCode>> mmGender = new MMMessageAttribute<IndividualPerson24, Optional<GenderCode>>() {
		{
			businessElementTrace_lazy = () -> Person.mmGender;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "Gndr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gender";
			definition = "Specifies the gender of the person.";
			previousVersion_lazy = () -> IndividualPerson21.mmGender;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> GenderCode.mmObject();
		}

		@Override
		public Optional<GenderCode> getValue(IndividualPerson24 obj) {
			return obj.getGender();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Optional<GenderCode> value) {
			obj.setGender(value.orElse(null));
		}
	};
	@XmlElement(name = "Lang")
	protected LanguageCode language;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.LanguageCode
	 * LanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmLanguage
	 * Person.mmLanguage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lang"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Language"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Language in which a person communicates."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmLanguage
	 * IndividualPerson21.mmLanguage}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson24, Optional<LanguageCode>> mmLanguage = new MMMessageAttribute<IndividualPerson24, Optional<LanguageCode>>() {
		{
			businessElementTrace_lazy = () -> Person.mmLanguage;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "Lang";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Language";
			definition = "Language in which a person communicates.";
			previousVersion_lazy = () -> IndividualPerson21.mmLanguage;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LanguageCode.mmObject();
		}

		@Override
		public Optional<LanguageCode> getValue(IndividualPerson24 obj) {
			return obj.getLanguage();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Optional<LanguageCode> value) {
			obj.setLanguage(value.orElse(null));
		}
	};
	@XmlElement(name = "BirthDt", required = true)
	protected ISODate birthDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmBirthDate
	 * Person.mmBirthDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BirthDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BirthDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which a person is born."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmBirthDate
	 * IndividualPerson21.mmBirthDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson24, ISODate> mmBirthDate = new MMMessageAttribute<IndividualPerson24, ISODate>() {
		{
			businessElementTrace_lazy = () -> Person.mmBirthDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "BirthDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BirthDate";
			definition = "Date on which a person is born.";
			previousVersion_lazy = () -> IndividualPerson21.mmBirthDate;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(IndividualPerson24 obj) {
			return obj.getBirthDate();
		}

		@Override
		public void setValue(IndividualPerson24 obj, ISODate value) {
			obj.setBirthDate(value);
		}
	};
	@XmlElement(name = "CtryOfBirth")
	protected CountryCode countryOfBirth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmPlaceOfBirth
	 * Person.mmPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfBirth"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country where a person was born."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmCountryOfBirth
	 * IndividualPerson21.mmCountryOfBirth}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson24, Optional<CountryCode>> mmCountryOfBirth = new MMMessageAttribute<IndividualPerson24, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Person.mmPlaceOfBirth;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "CtryOfBirth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfBirth";
			definition = "Country where a person was born.";
			previousVersion_lazy = () -> IndividualPerson21.mmCountryOfBirth;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(IndividualPerson24 obj) {
			return obj.getCountryOfBirth();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Optional<CountryCode> value) {
			obj.setCountryOfBirth(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvcOfBirth")
	protected Max35Text provinceOfBirth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmPlaceOfBirth
	 * Person.mmPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvcOfBirth"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProvinceOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Province where a person was born."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmProvinceOfBirth
	 * IndividualPerson21.mmProvinceOfBirth}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson24, Optional<Max35Text>> mmProvinceOfBirth = new MMMessageAttribute<IndividualPerson24, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Person.mmPlaceOfBirth;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "PrvcOfBirth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProvinceOfBirth";
			definition = "Province where a person was born.";
			previousVersion_lazy = () -> IndividualPerson21.mmProvinceOfBirth;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IndividualPerson24 obj) {
			return obj.getProvinceOfBirth();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Optional<Max35Text> value) {
			obj.setProvinceOfBirth(value.orElse(null));
		}
	};
	@XmlElement(name = "CityOfBirth")
	protected Max35Text cityOfBirth;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmPlaceOfBirth
	 * Person.mmPlaceOfBirth}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CityOfBirth"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CityOfBirth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "City where a person was born."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmCityOfBirth
	 * IndividualPerson21.mmCityOfBirth}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson24, Optional<Max35Text>> mmCityOfBirth = new MMMessageAttribute<IndividualPerson24, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Person.mmPlaceOfBirth;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "CityOfBirth";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CityOfBirth";
			definition = "City where a person was born.";
			previousVersion_lazy = () -> IndividualPerson21.mmCityOfBirth;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IndividualPerson24 obj) {
			return obj.getCityOfBirth();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Optional<Max35Text> value) {
			obj.setCityOfBirth(value.orElse(null));
		}
	};
	@XmlElement(name = "Prfssn")
	protected Max35Text profession;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmProfession
	 * Person.mmProfession}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prfssn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Profession"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the occupation or job of a person."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmProfession
	 * IndividualPerson21.mmProfession}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson24, Optional<Max35Text>> mmProfession = new MMMessageAttribute<IndividualPerson24, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Person.mmProfession;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "Prfssn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Profession";
			definition = "Name of the occupation or job of a person.";
			previousVersion_lazy = () -> IndividualPerson21.mmProfession;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IndividualPerson24 obj) {
			return obj.getProfession();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Optional<Max35Text> value) {
			obj.setProfession(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxtnCtry")
	protected CountryCode taxationCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmCountry Tax.mmCountry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxtnCtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country of taxation of an individual person."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmTaxationCountry
	 * IndividualPerson21.mmTaxationCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson24, Optional<CountryCode>> mmTaxationCountry = new MMMessageAttribute<IndividualPerson24, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmCountry;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "TaxtnCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxationCountry";
			definition = "Country of taxation of an individual person.";
			previousVersion_lazy = () -> IndividualPerson21.mmTaxationCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(IndividualPerson24 obj) {
			return obj.getTaxationCountry();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Optional<CountryCode> value) {
			obj.setTaxationCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "CtryAndResdtlSts")
	protected CountryAndResidentialStatusType1 countryAndResidentialStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CountryAndResidentialStatusType1
	 * CountryAndResidentialStatusType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmResidentialStatus
	 * Person.mmResidentialStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryAndResdtlSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryAndResidentialStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country and residential status of an individual, for example, non-permanent resident."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmCountryAndResidentialStatus
	 * IndividualPerson21.mmCountryAndResidentialStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson24, Optional<CountryAndResidentialStatusType1>> mmCountryAndResidentialStatus = new MMMessageAttribute<IndividualPerson24, Optional<CountryAndResidentialStatusType1>>() {
		{
			businessElementTrace_lazy = () -> Person.mmResidentialStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "CtryAndResdtlSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryAndResidentialStatus";
			definition = "Country and residential status of an individual, for example, non-permanent resident.";
			previousVersion_lazy = () -> IndividualPerson21.mmCountryAndResidentialStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CountryAndResidentialStatusType1.mmObject();
		}

		@Override
		public Optional<CountryAndResidentialStatusType1> getValue(IndividualPerson24 obj) {
			return obj.getCountryAndResidentialStatus();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Optional<CountryAndResidentialStatusType1> value) {
			obj.setCountryAndResidentialStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "BizFctn")
	protected Max35Text businessFunction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmBusinessFunctionTitle
	 * Person.mmBusinessFunctionTitle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizFctn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessFunction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Title of the function."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmBusinessFunction
	 * IndividualPerson21.mmBusinessFunction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson24, Optional<Max35Text>> mmBusinessFunction = new MMMessageAttribute<IndividualPerson24, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Person.mmBusinessFunctionTitle;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "BizFctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessFunction";
			definition = "Title of the function.";
			previousVersion_lazy = () -> IndividualPerson21.mmBusinessFunction;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(IndividualPerson24 obj) {
			return obj.getBusinessFunction();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Optional<Max35Text> value) {
			obj.setBusinessFunction(value.orElse(null));
		}
	};
	@XmlElement(name = "EmplngCpny")
	protected Max140Text employingCompany;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.EmployingPartyRole
	 * EmployingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EmplngCpny"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EmployingCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organisation represented by a person, or for which a person works."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmEmployingCompany
	 * IndividualPerson21.mmEmployingCompany}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson24, Optional<Max140Text>> mmEmployingCompany = new MMMessageAttribute<IndividualPerson24, Optional<Max140Text>>() {
		{
			businessComponentTrace_lazy = () -> EmployingPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "EmplngCpny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployingCompany";
			definition = "Organisation represented by a person, or for which a person works.";
			previousVersion_lazy = () -> IndividualPerson21.mmEmployingCompany;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(IndividualPerson24 obj) {
			return obj.getEmployingCompany();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Optional<Max140Text> value) {
			obj.setEmployingCompany(value.orElse(null));
		}
	};
	@XmlElement(name = "ModfdPstlAdr")
	protected List<ModificationScope1> modifiedPostalAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ModificationScope1
	 * ModificationScope1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdPstlAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedPostalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address information to be either inserted, updated or deleted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmModifiedPostalAddress
	 * IndividualPerson21.mmModifiedPostalAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualPerson24, List<ModificationScope1>> mmModifiedPostalAddress = new MMMessageAssociationEnd<IndividualPerson24, List<ModificationScope1>>() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "ModfdPstlAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedPostalAddress";
			definition = "Address information to be either inserted, updated or deleted.";
			previousVersion_lazy = () -> IndividualPerson21.mmModifiedPostalAddress;
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ModificationScope1.mmObject();
		}

		@Override
		public List<ModificationScope1> getValue(IndividualPerson24 obj) {
			return obj.getModifiedPostalAddress();
		}

		@Override
		public void setValue(IndividualPerson24 obj, List<ModificationScope1> value) {
			obj.setModifiedPostalAddress(value);
		}
	};
	@XmlElement(name = "ModfdCtznsh")
	protected List<ModificationScope3> modifiedCitizenship;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ModificationScope3
	 * ModificationScope3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person#mmNationality
	 * Person.mmNationality}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdCtznsh"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedCitizenship"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Citizenship information to be inserted or deleted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmModifiedCitizenship
	 * IndividualPerson21.mmModifiedCitizenship}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualPerson24, List<ModificationScope3>> mmModifiedCitizenship = new MMMessageAssociationEnd<IndividualPerson24, List<ModificationScope3>>() {
		{
			businessElementTrace_lazy = () -> Person.mmNationality;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "ModfdCtznsh";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedCitizenship";
			definition = "Citizenship information to be inserted or deleted.";
			previousVersion_lazy = () -> IndividualPerson21.mmModifiedCitizenship;
			maxOccurs = 3;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ModificationScope3.mmObject();
		}

		@Override
		public List<ModificationScope3> getValue(IndividualPerson24 obj) {
			return obj.getModifiedCitizenship();
		}

		@Override
		public void setValue(IndividualPerson24 obj, List<ModificationScope3> value) {
			obj.setModifiedCitizenship(value);
		}
	};
	@XmlElement(name = "PmryComAdr")
	protected CommunicationAddress3 primaryCommunicationAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CommunicationAddress3
	 * CommunicationAddress3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmryComAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryCommunicationAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Communication device number or electronic address used for communication."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmPrimaryCommunicationAddress
	 * IndividualPerson21.mmPrimaryCommunicationAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualPerson24, Optional<CommunicationAddress3>> mmPrimaryCommunicationAddress = new MMMessageAssociationEnd<IndividualPerson24, Optional<CommunicationAddress3>>() {
		{
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "PmryComAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryCommunicationAddress";
			definition = "Communication device number or electronic address used for communication.";
			previousVersion_lazy = () -> IndividualPerson21.mmPrimaryCommunicationAddress;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommunicationAddress3.mmObject();
		}

		@Override
		public Optional<CommunicationAddress3> getValue(IndividualPerson24 obj) {
			return obj.getPrimaryCommunicationAddress();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Optional<CommunicationAddress3> value) {
			obj.setPrimaryCommunicationAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndryComAdr")
	protected CommunicationAddress3 secondaryCommunicationAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CommunicationAddress3
	 * CommunicationAddress3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndryComAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryCommunicationAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Communication device number or electronic address used for communication."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmSecondaryCommunicationAddress
	 * IndividualPerson21.mmSecondaryCommunicationAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualPerson24, Optional<CommunicationAddress3>> mmSecondaryCommunicationAddress = new MMMessageAssociationEnd<IndividualPerson24, Optional<CommunicationAddress3>>() {
		{
			businessComponentTrace_lazy = () -> ElectronicAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "ScndryComAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryCommunicationAddress";
			definition = "Communication device number or electronic address used for communication.";
			previousVersion_lazy = () -> IndividualPerson21.mmSecondaryCommunicationAddress;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CommunicationAddress3.mmObject();
		}

		@Override
		public Optional<CommunicationAddress3> getValue(IndividualPerson24 obj) {
			return obj.getSecondaryCommunicationAddress();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Optional<CommunicationAddress3> value) {
			obj.setSecondaryCommunicationAddress(value.orElse(null));
		}
	};
	@XmlElement(name = "ModfdOthrId")
	protected List<ModificationScope23> modifiedOtherIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ModificationScope23
	 * ModificationScope23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ModfdOthrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ModifiedOtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification information to be either inserted or deleted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmModifiedOtherIdentification
	 * IndividualPerson21.mmModifiedOtherIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualPerson24, List<ModificationScope23>> mmModifiedOtherIdentification = new MMMessageAssociationEnd<IndividualPerson24, List<ModificationScope23>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "ModfdOthrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ModifiedOtherIdentification";
			definition = "Identification information to be either inserted or deleted.";
			previousVersion_lazy = () -> IndividualPerson21.mmModifiedOtherIdentification;
			maxOccurs = 10;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ModificationScope23.mmObject();
		}

		@Override
		public List<ModificationScope23> getValue(IndividualPerson24 obj) {
			return obj.getModifiedOtherIdentification();
		}

		@Override
		public void setValue(IndividualPerson24 obj, List<ModificationScope23> value) {
			obj.setModifiedOtherIdentification(value);
		}
	};
	@XmlElement(name = "AddtlRgltryInf")
	protected RegulatoryInformation1 additionalRegulatoryInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.RegulatoryInformation1
	 * RegulatoryInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRgltryInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRegulatoryInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional regulatory information about the investor that is required in some markets to support anti-money laundering laws."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmAdditionalRegulatoryInformation
	 * IndividualPerson21.mmAdditionalRegulatoryInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<IndividualPerson24, Optional<RegulatoryInformation1>> mmAdditionalRegulatoryInformation = new MMMessageAttribute<IndividualPerson24, Optional<RegulatoryInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "AddtlRgltryInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRegulatoryInformation";
			definition = "Additional regulatory information about the investor that is required in some markets to support anti-money laundering laws.";
			previousVersion_lazy = () -> IndividualPerson21.mmAdditionalRegulatoryInformation;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RegulatoryInformation1.mmObject();
		}

		@Override
		public Optional<RegulatoryInformation1> getValue(IndividualPerson24 obj) {
			return obj.getAdditionalRegulatoryInformation();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Optional<RegulatoryInformation1> value) {
			obj.setAdditionalRegulatoryInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "PltclyXpsdPrsnTp")
	protected PoliticalExposureType1Choice politicallyExposedPersonType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PoliticalExposureType1Choice
	 * PoliticalExposureType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PersonProfile#mmPoliticalExposureType
	 * PersonProfile.mmPoliticalExposureType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson24
	 * IndividualPerson24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PltclyXpsdPrsnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoliticallyExposedPersonType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if due diligence checks on the political exposure of the investor have been carried out and whether these checks are national or foreign. (A politically exposed person is someone who has been entrusted with a prominent public function, or an individual who is closely related to such a person.)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.IndividualPerson21#mmPoliticallyExposedPersonType
	 * IndividualPerson21.mmPoliticallyExposedPersonType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<IndividualPerson24, Optional<PoliticalExposureType1Choice>> mmPoliticallyExposedPersonType = new MMMessageAssociationEnd<IndividualPerson24, Optional<PoliticalExposureType1Choice>>() {
		{
			businessElementTrace_lazy = () -> PersonProfile.mmPoliticalExposureType;
			componentContext_lazy = () -> com.tools20022.repository.msg.IndividualPerson24.mmObject();
			isDerived = false;
			xmlTag = "PltclyXpsdPrsnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoliticallyExposedPersonType";
			definition = "Specifies if due diligence checks on the political exposure of the investor have been carried out and whether these checks are national or foreign. (A politically exposed person is someone who has been entrusted with a prominent public function, or an individual who is closely related to such a person.).";
			previousVersion_lazy = () -> IndividualPerson21.mmPoliticallyExposedPersonType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PoliticalExposureType1Choice.mmObject();
		}

		@Override
		public Optional<PoliticalExposureType1Choice> getValue(IndividualPerson24 obj) {
			return obj.getPoliticallyExposedPersonType();
		}

		@Override
		public void setValue(IndividualPerson24 obj, Optional<PoliticalExposureType1Choice> value) {
			obj.setPoliticallyExposedPersonType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.IndividualPerson24.mmNamePrefix, com.tools20022.repository.msg.IndividualPerson24.mmGivenName,
						com.tools20022.repository.msg.IndividualPerson24.mmMiddleName, com.tools20022.repository.msg.IndividualPerson24.mmName, com.tools20022.repository.msg.IndividualPerson24.mmNameSuffix,
						com.tools20022.repository.msg.IndividualPerson24.mmGender, com.tools20022.repository.msg.IndividualPerson24.mmLanguage, com.tools20022.repository.msg.IndividualPerson24.mmBirthDate,
						com.tools20022.repository.msg.IndividualPerson24.mmCountryOfBirth, com.tools20022.repository.msg.IndividualPerson24.mmProvinceOfBirth, com.tools20022.repository.msg.IndividualPerson24.mmCityOfBirth,
						com.tools20022.repository.msg.IndividualPerson24.mmProfession, com.tools20022.repository.msg.IndividualPerson24.mmTaxationCountry, com.tools20022.repository.msg.IndividualPerson24.mmCountryAndResidentialStatus,
						com.tools20022.repository.msg.IndividualPerson24.mmBusinessFunction, com.tools20022.repository.msg.IndividualPerson24.mmEmployingCompany, com.tools20022.repository.msg.IndividualPerson24.mmModifiedPostalAddress,
						com.tools20022.repository.msg.IndividualPerson24.mmModifiedCitizenship, com.tools20022.repository.msg.IndividualPerson24.mmPrimaryCommunicationAddress,
						com.tools20022.repository.msg.IndividualPerson24.mmSecondaryCommunicationAddress, com.tools20022.repository.msg.IndividualPerson24.mmModifiedOtherIdentification,
						com.tools20022.repository.msg.IndividualPerson24.mmAdditionalRegulatoryInformation, com.tools20022.repository.msg.IndividualPerson24.mmPoliticallyExposedPersonType);
				trace_lazy = () -> Person.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IndividualPerson24";
				definition = "Human entity, as distinguished from a corporate entity (which is sometimes referred to as an 'artificial person').";
				previousVersion_lazy = () -> IndividualPerson21.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<NamePrefix1Choice> getNamePrefix() {
		return namePrefix == null ? Optional.empty() : Optional.of(namePrefix);
	}

	public IndividualPerson24 setNamePrefix(NamePrefix1Choice namePrefix) {
		this.namePrefix = namePrefix;
		return this;
	}

	public Max35Text getGivenName() {
		return givenName;
	}

	public IndividualPerson24 setGivenName(Max35Text givenName) {
		this.givenName = Objects.requireNonNull(givenName);
		return this;
	}

	public Optional<Max35Text> getMiddleName() {
		return middleName == null ? Optional.empty() : Optional.of(middleName);
	}

	public IndividualPerson24 setMiddleName(Max35Text middleName) {
		this.middleName = middleName;
		return this;
	}

	public Max350Text getName() {
		return name;
	}

	public IndividualPerson24 setName(Max350Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public Optional<Max35Text> getNameSuffix() {
		return nameSuffix == null ? Optional.empty() : Optional.of(nameSuffix);
	}

	public IndividualPerson24 setNameSuffix(Max35Text nameSuffix) {
		this.nameSuffix = nameSuffix;
		return this;
	}

	public Optional<GenderCode> getGender() {
		return gender == null ? Optional.empty() : Optional.of(gender);
	}

	public IndividualPerson24 setGender(GenderCode gender) {
		this.gender = gender;
		return this;
	}

	public Optional<LanguageCode> getLanguage() {
		return language == null ? Optional.empty() : Optional.of(language);
	}

	public IndividualPerson24 setLanguage(LanguageCode language) {
		this.language = language;
		return this;
	}

	public ISODate getBirthDate() {
		return birthDate;
	}

	public IndividualPerson24 setBirthDate(ISODate birthDate) {
		this.birthDate = Objects.requireNonNull(birthDate);
		return this;
	}

	public Optional<CountryCode> getCountryOfBirth() {
		return countryOfBirth == null ? Optional.empty() : Optional.of(countryOfBirth);
	}

	public IndividualPerson24 setCountryOfBirth(CountryCode countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
		return this;
	}

	public Optional<Max35Text> getProvinceOfBirth() {
		return provinceOfBirth == null ? Optional.empty() : Optional.of(provinceOfBirth);
	}

	public IndividualPerson24 setProvinceOfBirth(Max35Text provinceOfBirth) {
		this.provinceOfBirth = provinceOfBirth;
		return this;
	}

	public Optional<Max35Text> getCityOfBirth() {
		return cityOfBirth == null ? Optional.empty() : Optional.of(cityOfBirth);
	}

	public IndividualPerson24 setCityOfBirth(Max35Text cityOfBirth) {
		this.cityOfBirth = cityOfBirth;
		return this;
	}

	public Optional<Max35Text> getProfession() {
		return profession == null ? Optional.empty() : Optional.of(profession);
	}

	public IndividualPerson24 setProfession(Max35Text profession) {
		this.profession = profession;
		return this;
	}

	public Optional<CountryCode> getTaxationCountry() {
		return taxationCountry == null ? Optional.empty() : Optional.of(taxationCountry);
	}

	public IndividualPerson24 setTaxationCountry(CountryCode taxationCountry) {
		this.taxationCountry = taxationCountry;
		return this;
	}

	public Optional<CountryAndResidentialStatusType1> getCountryAndResidentialStatus() {
		return countryAndResidentialStatus == null ? Optional.empty() : Optional.of(countryAndResidentialStatus);
	}

	public IndividualPerson24 setCountryAndResidentialStatus(CountryAndResidentialStatusType1 countryAndResidentialStatus) {
		this.countryAndResidentialStatus = countryAndResidentialStatus;
		return this;
	}

	public Optional<Max35Text> getBusinessFunction() {
		return businessFunction == null ? Optional.empty() : Optional.of(businessFunction);
	}

	public IndividualPerson24 setBusinessFunction(Max35Text businessFunction) {
		this.businessFunction = businessFunction;
		return this;
	}

	public Optional<Max140Text> getEmployingCompany() {
		return employingCompany == null ? Optional.empty() : Optional.of(employingCompany);
	}

	public IndividualPerson24 setEmployingCompany(Max140Text employingCompany) {
		this.employingCompany = employingCompany;
		return this;
	}

	public List<ModificationScope1> getModifiedPostalAddress() {
		return modifiedPostalAddress == null ? modifiedPostalAddress = new ArrayList<>() : modifiedPostalAddress;
	}

	public IndividualPerson24 setModifiedPostalAddress(List<ModificationScope1> modifiedPostalAddress) {
		this.modifiedPostalAddress = Objects.requireNonNull(modifiedPostalAddress);
		return this;
	}

	public List<ModificationScope3> getModifiedCitizenship() {
		return modifiedCitizenship == null ? modifiedCitizenship = new ArrayList<>() : modifiedCitizenship;
	}

	public IndividualPerson24 setModifiedCitizenship(List<ModificationScope3> modifiedCitizenship) {
		this.modifiedCitizenship = Objects.requireNonNull(modifiedCitizenship);
		return this;
	}

	public Optional<CommunicationAddress3> getPrimaryCommunicationAddress() {
		return primaryCommunicationAddress == null ? Optional.empty() : Optional.of(primaryCommunicationAddress);
	}

	public IndividualPerson24 setPrimaryCommunicationAddress(CommunicationAddress3 primaryCommunicationAddress) {
		this.primaryCommunicationAddress = primaryCommunicationAddress;
		return this;
	}

	public Optional<CommunicationAddress3> getSecondaryCommunicationAddress() {
		return secondaryCommunicationAddress == null ? Optional.empty() : Optional.of(secondaryCommunicationAddress);
	}

	public IndividualPerson24 setSecondaryCommunicationAddress(CommunicationAddress3 secondaryCommunicationAddress) {
		this.secondaryCommunicationAddress = secondaryCommunicationAddress;
		return this;
	}

	public List<ModificationScope23> getModifiedOtherIdentification() {
		return modifiedOtherIdentification == null ? modifiedOtherIdentification = new ArrayList<>() : modifiedOtherIdentification;
	}

	public IndividualPerson24 setModifiedOtherIdentification(List<ModificationScope23> modifiedOtherIdentification) {
		this.modifiedOtherIdentification = Objects.requireNonNull(modifiedOtherIdentification);
		return this;
	}

	public Optional<RegulatoryInformation1> getAdditionalRegulatoryInformation() {
		return additionalRegulatoryInformation == null ? Optional.empty() : Optional.of(additionalRegulatoryInformation);
	}

	public IndividualPerson24 setAdditionalRegulatoryInformation(RegulatoryInformation1 additionalRegulatoryInformation) {
		this.additionalRegulatoryInformation = additionalRegulatoryInformation;
		return this;
	}

	public Optional<PoliticalExposureType1Choice> getPoliticallyExposedPersonType() {
		return politicallyExposedPersonType == null ? Optional.empty() : Optional.of(politicallyExposedPersonType);
	}

	public IndividualPerson24 setPoliticallyExposedPersonType(PoliticalExposureType1Choice politicallyExposedPersonType) {
		this.politicallyExposedPersonType = politicallyExposedPersonType;
		return this;
	}
}