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
import com.tools20022.repository.choice.OrganisationType1Choice;
import com.tools20022.repository.choice.PartyIdentification72Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PostalAddress21;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Organised structure that is set up for a particular purpose, for example, a
 * business, government body, department, charity, or financial institution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation24#mmName
 * Organisation24.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation24#mmShortName
 * Organisation24.mmShortName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation24#mmIdentification
 * Organisation24.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation24#mmLegalEntityIdentifier
 * Organisation24.mmLegalEntityIdentifier}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation24#mmPurpose
 * Organisation24.mmPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation24#mmRegistrationCountry
 * Organisation24.mmRegistrationCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation24#mmRegistrationDate
 * Organisation24.mmRegistrationDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation24#mmPostalAddress
 * Organisation24.mmPostalAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Organisation24#mmTypeOfOrganisation
 * Organisation24.mmTypeOfOrganisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Organisation
 * Organisation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Organisation24"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Organised structure that is set up for a particular purpose, for example, a business, government body, department, charity, or financial institution."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation22 Organisation22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation23 Organisation23}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Organisation30 Organisation30}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Organisation16
 * Organisation16}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Organisation24", propOrder = {"name", "shortName", "identification", "legalEntityIdentifier", "purpose", "registrationCountry", "registrationDate", "postalAddress", "typeOfOrganisation"})
public class Organisation24 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation22#mmName
	 * Organisation22.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation23#mmName
	 * Organisation23.mmName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#mmName
	 * Organisation30.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation16#mmName
	 * Organisation16.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation24, Max350Text> mmName = new MMMessageAttribute<Organisation24, Max350Text>() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation24.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name by which a party is known and which is usually used to identify that party.";
			nextVersions_lazy = () -> Arrays.asList(Organisation22.mmName, Organisation23.mmName, Organisation30.mmName);
			previousVersion_lazy = () -> Organisation16.mmName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(Organisation24 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(Organisation24 obj, Max350Text value) {
			obj.setName(value);
		}
	};
	@XmlElement(name = "ShrtNm")
	protected Max35Text shortName;
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
	 * {@linkplain com.tools20022.repository.entity.OrganisationName#mmShortName
	 * OrganisationName.mmShortName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ShrtNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the organisation in short form."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation23#mmShortName
	 * Organisation23.mmShortName}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#mmShortName
	 * Organisation30.mmShortName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation24, Optional<Max35Text>> mmShortName = new MMMessageAttribute<Organisation24, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> OrganisationName.mmShortName;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation24.mmObject();
			isDerived = false;
			xmlTag = "ShrtNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortName";
			definition = "Name of the organisation in short form.";
			nextVersions_lazy = () -> Arrays.asList(Organisation23.mmShortName, Organisation30.mmShortName);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Organisation24 obj) {
			return obj.getShortName();
		}

		@Override
		public void setValue(Organisation24 obj, Optional<Max35Text> value) {
			obj.setShortName(value.orElse(null));
		}
	};
	@XmlElement(name = "Id")
	protected PartyIdentification72Choice identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification72Choice
	 * PartyIdentification72Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique and unambiguous identifier for the organisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation22#mmIdentification
	 * Organisation22.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#mmIdentification
	 * Organisation30.mmIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation16#mmIdentification
	 * Organisation16.mmIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation24, Optional<PartyIdentification72Choice>> mmIdentification = new MMMessageAttribute<Organisation24, Optional<PartyIdentification72Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation24.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Unique and unambiguous identifier for the organisation.";
			nextVersions_lazy = () -> Arrays.asList(Organisation22.mmIdentification, Organisation30.mmIdentification);
			previousVersion_lazy = () -> Organisation16.mmIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification72Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification72Choice> getValue(Organisation24 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(Organisation24 obj, Optional<PartyIdentification72Choice> value) {
			obj.setIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "LglNttyIdr")
	protected LEIIdentifier legalEntityIdentifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmLEI
	 * PartyIdentificationInformation.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglNttyIdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalEntityIdentifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the organisation with a Legal Entity Identifier. This is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\"."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation22#mmLegalEntityIdentifier
	 * Organisation22.mmLegalEntityIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#mmLegalEntityIdentifier
	 * Organisation30.mmLegalEntityIdentifier}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation24, Optional<LEIIdentifier>> mmLegalEntityIdentifier = new MMMessageAttribute<Organisation24, Optional<LEIIdentifier>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmLEI;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation24.mmObject();
			isDerived = false;
			xmlTag = "LglNttyIdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalEntityIdentifier";
			definition = "Identification of the organisation with a Legal Entity Identifier. This is a code allocated to a party as described in ISO 17442 \"Financial Services - Legal Entity Identifier (LEI)\".";
			nextVersions_lazy = () -> Arrays.asList(Organisation22.mmLegalEntityIdentifier, Organisation30.mmLegalEntityIdentifier);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public Optional<LEIIdentifier> getValue(Organisation24 obj) {
			return obj.getLegalEntityIdentifier();
		}

		@Override
		public void setValue(Organisation24 obj, Optional<LEIIdentifier> value) {
			obj.setLegalEntityIdentifier(value.orElse(null));
		}
	};
	@XmlElement(name = "Purp")
	protected Max35Text purpose;
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
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmPurpose
	 * Organisation.mmPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Purp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Purpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Purpose of the organisation, for example, charity."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation22#mmPurpose
	 * Organisation22.mmPurpose}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Organisation30#mmPurpose
	 * Organisation30.mmPurpose}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation16#mmPurpose
	 * Organisation16.mmPurpose}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation24, Optional<Max35Text>> mmPurpose = new MMMessageAttribute<Organisation24, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation24.mmObject();
			isDerived = false;
			xmlTag = "Purp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Purpose";
			definition = "Purpose of the organisation, for example, charity.";
			nextVersions_lazy = () -> Arrays.asList(Organisation22.mmPurpose, Organisation30.mmPurpose);
			previousVersion_lazy = () -> Organisation16.mmPurpose;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(Organisation24 obj) {
			return obj.getPurpose();
		}

		@Override
		public void setValue(Organisation24 obj, Optional<Max35Text> value) {
			obj.setPurpose(value.orElse(null));
		}
	};
	@XmlElement(name = "RegnCtry")
	protected CountryCode registrationCountry;
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
	 * {@linkplain com.tools20022.repository.entity.Country#mmCode
	 * Country.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnCtry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Country in which the organisation is registered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation22#mmRegistrationCountry
	 * Organisation22.mmRegistrationCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#mmRegistrationCountry
	 * Organisation30.mmRegistrationCountry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation16#mmRegistrationCountry
	 * Organisation16.mmRegistrationCountry}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation24, Optional<CountryCode>> mmRegistrationCountry = new MMMessageAttribute<Organisation24, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> Country.mmCode;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation24.mmObject();
			isDerived = false;
			xmlTag = "RegnCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationCountry";
			definition = "Country in which the organisation is registered.";
			nextVersions_lazy = () -> Arrays.asList(Organisation22.mmRegistrationCountry, Organisation30.mmRegistrationCountry);
			previousVersion_lazy = () -> Organisation16.mmRegistrationCountry;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(Organisation24 obj) {
			return obj.getRegistrationCountry();
		}

		@Override
		public void setValue(Organisation24 obj, Optional<CountryCode> value) {
			obj.setRegistrationCountry(value.orElse(null));
		}
	};
	@XmlElement(name = "RegnDt")
	protected ISODate registrationDate;
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
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmRegistrationDate
	 * Organisation.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a given organisation was officially registered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation22#mmRegistrationDate
	 * Organisation22.mmRegistrationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#mmRegistrationDate
	 * Organisation30.mmRegistrationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation16#mmRegistrationDate
	 * Organisation16.mmRegistrationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Organisation24, Optional<ISODate>> mmRegistrationDate = new MMMessageAttribute<Organisation24, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmRegistrationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation24.mmObject();
			isDerived = false;
			xmlTag = "RegnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDate";
			definition = "Date and time at which a given organisation was officially registered.";
			nextVersions_lazy = () -> Arrays.asList(Organisation22.mmRegistrationDate, Organisation30.mmRegistrationDate);
			previousVersion_lazy = () -> Organisation16.mmRegistrationDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Organisation24 obj) {
			return obj.getRegistrationDate();
		}

		@Override
		public void setValue(Organisation24 obj, Optional<ISODate> value) {
			obj.setRegistrationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "PstlAdr", required = true)
	protected List<PostalAddress21> postalAddress;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress21
	 * PostalAddress21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PstlAdr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information that locates and identifies a specific address, as defined by postal services."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation23#mmPostalAddress
	 * Organisation23.mmPostalAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#mmPostalAddress
	 * Organisation30.mmPostalAddress}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Organisation16#mmPostalAddress
	 * Organisation16.mmPostalAddress}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation24, List<PostalAddress21>> mmPostalAddress = new MMMessageAssociationEnd<Organisation24, List<PostalAddress21>>() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation24.mmObject();
			isDerived = false;
			xmlTag = "PstlAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalAddress";
			definition = "Information that locates and identifies a specific address, as defined by postal services.";
			nextVersions_lazy = () -> Arrays.asList(Organisation23.mmPostalAddress, Organisation30.mmPostalAddress);
			previousVersion_lazy = () -> Organisation16.mmPostalAddress;
			maxOccurs = 10;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PostalAddress21.mmObject();
		}

		@Override
		public List<PostalAddress21> getValue(Organisation24 obj) {
			return obj.getPostalAddress();
		}

		@Override
		public void setValue(Organisation24 obj, List<PostalAddress21> value) {
			obj.setPostalAddress(value);
		}
	};
	@XmlElement(name = "TpOfOrg")
	protected OrganisationType1Choice typeOfOrganisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OrganisationType1Choice
	 * OrganisationType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Organisation24 Organisation24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpOfOrg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOrganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of organisation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation22#mmTypeOfOrganisation
	 * Organisation22.mmTypeOfOrganisation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Organisation30#mmTypeOfOrganisation
	 * Organisation30.mmTypeOfOrganisation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Organisation24, Optional<OrganisationType1Choice>> mmTypeOfOrganisation = new MMMessageAssociationEnd<Organisation24, Optional<OrganisationType1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Organisation24.mmObject();
			isDerived = false;
			xmlTag = "TpOfOrg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOrganisation";
			definition = "Type of organisation.";
			nextVersions_lazy = () -> Arrays.asList(Organisation22.mmTypeOfOrganisation, Organisation30.mmTypeOfOrganisation);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OrganisationType1Choice.mmObject();
		}

		@Override
		public Optional<OrganisationType1Choice> getValue(Organisation24 obj) {
			return obj.getTypeOfOrganisation();
		}

		@Override
		public void setValue(Organisation24 obj, Optional<OrganisationType1Choice> value) {
			obj.setTypeOfOrganisation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Organisation24.mmName, com.tools20022.repository.msg.Organisation24.mmShortName, com.tools20022.repository.msg.Organisation24.mmIdentification,
						com.tools20022.repository.msg.Organisation24.mmLegalEntityIdentifier, com.tools20022.repository.msg.Organisation24.mmPurpose, com.tools20022.repository.msg.Organisation24.mmRegistrationCountry,
						com.tools20022.repository.msg.Organisation24.mmRegistrationDate, com.tools20022.repository.msg.Organisation24.mmPostalAddress, com.tools20022.repository.msg.Organisation24.mmTypeOfOrganisation);
				trace_lazy = () -> Organisation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Organisation24";
				definition = "Organised structure that is set up for a particular purpose, for example, a business, government body, department, charity, or financial institution.";
				nextVersions_lazy = () -> Arrays.asList(Organisation22.mmObject(), Organisation23.mmObject(), Organisation30.mmObject());
				previousVersion_lazy = () -> Organisation16.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getName() {
		return name;
	}

	public Organisation24 setName(Max350Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public Optional<Max35Text> getShortName() {
		return shortName == null ? Optional.empty() : Optional.of(shortName);
	}

	public Organisation24 setShortName(Max35Text shortName) {
		this.shortName = shortName;
		return this;
	}

	public Optional<PartyIdentification72Choice> getIdentification() {
		return identification == null ? Optional.empty() : Optional.of(identification);
	}

	public Organisation24 setIdentification(PartyIdentification72Choice identification) {
		this.identification = identification;
		return this;
	}

	public Optional<LEIIdentifier> getLegalEntityIdentifier() {
		return legalEntityIdentifier == null ? Optional.empty() : Optional.of(legalEntityIdentifier);
	}

	public Organisation24 setLegalEntityIdentifier(LEIIdentifier legalEntityIdentifier) {
		this.legalEntityIdentifier = legalEntityIdentifier;
		return this;
	}

	public Optional<Max35Text> getPurpose() {
		return purpose == null ? Optional.empty() : Optional.of(purpose);
	}

	public Organisation24 setPurpose(Max35Text purpose) {
		this.purpose = purpose;
		return this;
	}

	public Optional<CountryCode> getRegistrationCountry() {
		return registrationCountry == null ? Optional.empty() : Optional.of(registrationCountry);
	}

	public Organisation24 setRegistrationCountry(CountryCode registrationCountry) {
		this.registrationCountry = registrationCountry;
		return this;
	}

	public Optional<ISODate> getRegistrationDate() {
		return registrationDate == null ? Optional.empty() : Optional.of(registrationDate);
	}

	public Organisation24 setRegistrationDate(ISODate registrationDate) {
		this.registrationDate = registrationDate;
		return this;
	}

	public List<PostalAddress21> getPostalAddress() {
		return postalAddress == null ? postalAddress = new ArrayList<>() : postalAddress;
	}

	public Organisation24 setPostalAddress(List<PostalAddress21> postalAddress) {
		this.postalAddress = Objects.requireNonNull(postalAddress);
		return this;
	}

	public Optional<OrganisationType1Choice> getTypeOfOrganisation() {
		return typeOfOrganisation == null ? Optional.empty() : Optional.of(typeOfOrganisation);
	}

	public Organisation24 setTypeOfOrganisation(OrganisationType1Choice typeOfOrganisation) {
		this.typeOfOrganisation = typeOfOrganisation;
		return this;
	}
}