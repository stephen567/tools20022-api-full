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
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information regarding corporate action options date
 * details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmPlaceAndName
 * CorporateActionDateSD7.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmActualEarlyExpirationDate
 * CorporateActionDateSD7.mmActualEarlyExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmActualProtectExpirationDate
 * CorporateActionDateSD7.mmActualProtectExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmActualEarlyProtectExpirationDate
 * CorporateActionDateSD7.mmActualEarlyProtectExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmDTCEarlyProtectExpirationDate
 * CorporateActionDateSD7.mmDTCEarlyProtectExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmActualEarlyCoverProtectExpirationDate
 * CorporateActionDateSD7.mmActualEarlyCoverProtectExpirationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7#mmDTCEarlyCoverProtectExpirationDate
 * CorporateActionDateSD7.mmDTCEarlyCoverProtectExpirationDate}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionDateSD7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information regarding corporate action options date details."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionDateSD9
 * CorporateActionDateSD9}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionDateSD7", propOrder = {"placeAndName", "actualEarlyExpirationDate", "actualProtectExpirationDate", "actualEarlyProtectExpirationDate", "dTCEarlyProtectExpirationDate",
		"actualEarlyCoverProtectExpirationDate", "dTCEarlyCoverProtectExpirationDate"})
public class CorporateActionDateSD7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm", required = true)
	protected Max350Text placeAndName;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7
	 * CorporateActionDateSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "xPath to the element that is being extended."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9#mmPlaceAndName
	 * CorporateActionDateSD9.mmPlaceAndName}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDateSD7, Max350Text> mmPlaceAndName = new MMMessageAttribute<CorporateActionDateSD7, Max350Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD7.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "xPath to the element that is being extended.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD9.mmPlaceAndName);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Max350Text getValue(CorporateActionDateSD7 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(CorporateActionDateSD7 obj, Max350Text value) {
			obj.setPlaceAndName(value);
		}
	};
	@XmlElement(name = "ActlEarlyXprtnDt")
	protected ISODateTime actualEarlyExpirationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7
	 * CorporateActionDateSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlEarlyXprtnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualEarlyExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Actual early expiration time as set by the issuer/offer/agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9#mmActualEarlyExpirationDate
	 * CorporateActionDateSD9.mmActualEarlyExpirationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDateSD7, Optional<ISODateTime>> mmActualEarlyExpirationDate = new MMMessageAttribute<CorporateActionDateSD7, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD7.mmObject();
			isDerived = false;
			xmlTag = "ActlEarlyXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualEarlyExpirationDate";
			definition = "Actual early expiration time as set by the issuer/offer/agent.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD9.mmActualEarlyExpirationDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CorporateActionDateSD7 obj) {
			return obj.getActualEarlyExpirationDate();
		}

		@Override
		public void setValue(CorporateActionDateSD7 obj, Optional<ISODateTime> value) {
			obj.setActualEarlyExpirationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ActlPrtctXprtnDt")
	protected ISODateTime actualProtectExpirationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7
	 * CorporateActionDateSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlPrtctXprtnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualProtectExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day protect instructions can be submitted to the issuer / agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9#mmActualProtectExpirationDate
	 * CorporateActionDateSD9.mmActualProtectExpirationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDateSD7, Optional<ISODateTime>> mmActualProtectExpirationDate = new MMMessageAttribute<CorporateActionDateSD7, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD7.mmObject();
			isDerived = false;
			xmlTag = "ActlPrtctXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualProtectExpirationDate";
			definition = "Last day protect instructions can be submitted to the issuer / agent.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD9.mmActualProtectExpirationDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CorporateActionDateSD7 obj) {
			return obj.getActualProtectExpirationDate();
		}

		@Override
		public void setValue(CorporateActionDateSD7 obj, Optional<ISODateTime> value) {
			obj.setActualProtectExpirationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ActlEarlyPrtctXprtnDt")
	protected ISODateTime actualEarlyProtectExpirationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7
	 * CorporateActionDateSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlEarlyPrtctXprtnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualEarlyProtectExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day protect instructions can be submitted to the issuer / agent for the early expiration."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9#mmActualEarlyProtectExpirationDate
	 * CorporateActionDateSD9.mmActualEarlyProtectExpirationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDateSD7, Optional<ISODateTime>> mmActualEarlyProtectExpirationDate = new MMMessageAttribute<CorporateActionDateSD7, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD7.mmObject();
			isDerived = false;
			xmlTag = "ActlEarlyPrtctXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualEarlyProtectExpirationDate";
			definition = "Last day protect instructions can be submitted to the issuer / agent for the early expiration.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD9.mmActualEarlyProtectExpirationDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CorporateActionDateSD7 obj) {
			return obj.getActualEarlyProtectExpirationDate();
		}

		@Override
		public void setValue(CorporateActionDateSD7 obj, Optional<ISODateTime> value) {
			obj.setActualEarlyProtectExpirationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCEarlyPrtctXprtnDt")
	protected ISODateTime dTCEarlyProtectExpirationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7
	 * CorporateActionDateSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCEarlyPrtctXprtnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCEarlyProtectExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day protect instructions can be submitted to DTC for the early expiration."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9#mmDTCEarlyProtectExpirationDate
	 * CorporateActionDateSD9.mmDTCEarlyProtectExpirationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDateSD7, Optional<ISODateTime>> mmDTCEarlyProtectExpirationDate = new MMMessageAttribute<CorporateActionDateSD7, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD7.mmObject();
			isDerived = false;
			xmlTag = "DTCEarlyPrtctXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCEarlyProtectExpirationDate";
			definition = "Last day protect instructions can be submitted to DTC for the early expiration.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD9.mmDTCEarlyProtectExpirationDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CorporateActionDateSD7 obj) {
			return obj.getDTCEarlyProtectExpirationDate();
		}

		@Override
		public void setValue(CorporateActionDateSD7 obj, Optional<ISODateTime> value) {
			obj.setDTCEarlyProtectExpirationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "ActlEarlyCoverPrtctXprtnDt")
	protected ISODateTime actualEarlyCoverProtectExpirationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7
	 * CorporateActionDateSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActlEarlyCoverPrtctXprtnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualEarlyCoverProtectExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day cover early protect instructions can be submitted to the issuer / agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9#mmActualEarlyCoverProtectExpirationDate
	 * CorporateActionDateSD9.mmActualEarlyCoverProtectExpirationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDateSD7, Optional<ISODateTime>> mmActualEarlyCoverProtectExpirationDate = new MMMessageAttribute<CorporateActionDateSD7, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD7.mmObject();
			isDerived = false;
			xmlTag = "ActlEarlyCoverPrtctXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualEarlyCoverProtectExpirationDate";
			definition = "Last day cover early protect instructions can be submitted to the issuer / agent.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD9.mmActualEarlyCoverProtectExpirationDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CorporateActionDateSD7 obj) {
			return obj.getActualEarlyCoverProtectExpirationDate();
		}

		@Override
		public void setValue(CorporateActionDateSD7 obj, Optional<ISODateTime> value) {
			obj.setActualEarlyCoverProtectExpirationDate(value.orElse(null));
		}
	};
	@XmlElement(name = "DTCEarlyCoverPrtctXprtnDt")
	protected ISODateTime dTCEarlyCoverProtectExpirationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD7
	 * CorporateActionDateSD7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DTCEarlyCoverPrtctXprtnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCEarlyCoverProtectExpirationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Last day cover early protect instructions can be submitted to DTC."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDateSD9#mmDTCEarlyCoverProtectExpirationDate
	 * CorporateActionDateSD9.mmDTCEarlyCoverProtectExpirationDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionDateSD7, Optional<ISODateTime>> mmDTCEarlyCoverProtectExpirationDate = new MMMessageAttribute<CorporateActionDateSD7, Optional<ISODateTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionDateSD7.mmObject();
			isDerived = false;
			xmlTag = "DTCEarlyCoverPrtctXprtnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCEarlyCoverProtectExpirationDate";
			definition = "Last day cover early protect instructions can be submitted to DTC.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD9.mmDTCEarlyCoverProtectExpirationDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public Optional<ISODateTime> getValue(CorporateActionDateSD7 obj) {
			return obj.getDTCEarlyCoverProtectExpirationDate();
		}

		@Override
		public void setValue(CorporateActionDateSD7 obj, Optional<ISODateTime> value) {
			obj.setDTCEarlyCoverProtectExpirationDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionDateSD7.mmPlaceAndName, com.tools20022.repository.msg.CorporateActionDateSD7.mmActualEarlyExpirationDate,
						com.tools20022.repository.msg.CorporateActionDateSD7.mmActualProtectExpirationDate, com.tools20022.repository.msg.CorporateActionDateSD7.mmActualEarlyProtectExpirationDate,
						com.tools20022.repository.msg.CorporateActionDateSD7.mmDTCEarlyProtectExpirationDate, com.tools20022.repository.msg.CorporateActionDateSD7.mmActualEarlyCoverProtectExpirationDate,
						com.tools20022.repository.msg.CorporateActionDateSD7.mmDTCEarlyCoverProtectExpirationDate);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CorporateActionDateSD7";
				definition = "Provides additional information regarding corporate action options date details.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionDateSD9.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max350Text getPlaceAndName() {
		return placeAndName;
	}

	public CorporateActionDateSD7 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = Objects.requireNonNull(placeAndName);
		return this;
	}

	public Optional<ISODateTime> getActualEarlyExpirationDate() {
		return actualEarlyExpirationDate == null ? Optional.empty() : Optional.of(actualEarlyExpirationDate);
	}

	public CorporateActionDateSD7 setActualEarlyExpirationDate(ISODateTime actualEarlyExpirationDate) {
		this.actualEarlyExpirationDate = actualEarlyExpirationDate;
		return this;
	}

	public Optional<ISODateTime> getActualProtectExpirationDate() {
		return actualProtectExpirationDate == null ? Optional.empty() : Optional.of(actualProtectExpirationDate);
	}

	public CorporateActionDateSD7 setActualProtectExpirationDate(ISODateTime actualProtectExpirationDate) {
		this.actualProtectExpirationDate = actualProtectExpirationDate;
		return this;
	}

	public Optional<ISODateTime> getActualEarlyProtectExpirationDate() {
		return actualEarlyProtectExpirationDate == null ? Optional.empty() : Optional.of(actualEarlyProtectExpirationDate);
	}

	public CorporateActionDateSD7 setActualEarlyProtectExpirationDate(ISODateTime actualEarlyProtectExpirationDate) {
		this.actualEarlyProtectExpirationDate = actualEarlyProtectExpirationDate;
		return this;
	}

	public Optional<ISODateTime> getDTCEarlyProtectExpirationDate() {
		return dTCEarlyProtectExpirationDate == null ? Optional.empty() : Optional.of(dTCEarlyProtectExpirationDate);
	}

	public CorporateActionDateSD7 setDTCEarlyProtectExpirationDate(ISODateTime dTCEarlyProtectExpirationDate) {
		this.dTCEarlyProtectExpirationDate = dTCEarlyProtectExpirationDate;
		return this;
	}

	public Optional<ISODateTime> getActualEarlyCoverProtectExpirationDate() {
		return actualEarlyCoverProtectExpirationDate == null ? Optional.empty() : Optional.of(actualEarlyCoverProtectExpirationDate);
	}

	public CorporateActionDateSD7 setActualEarlyCoverProtectExpirationDate(ISODateTime actualEarlyCoverProtectExpirationDate) {
		this.actualEarlyCoverProtectExpirationDate = actualEarlyCoverProtectExpirationDate;
		return this;
	}

	public Optional<ISODateTime> getDTCEarlyCoverProtectExpirationDate() {
		return dTCEarlyCoverProtectExpirationDate == null ? Optional.empty() : Optional.of(dTCEarlyCoverProtectExpirationDate);
	}

	public CorporateActionDateSD7 setDTCEarlyCoverProtectExpirationDate(ISODateTime dTCEarlyCoverProtectExpirationDate) {
		this.dTCEarlyCoverProtectExpirationDate = dTCEarlyCoverProtectExpirationDate;
		return this;
	}
}