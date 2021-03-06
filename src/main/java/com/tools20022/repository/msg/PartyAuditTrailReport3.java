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
import com.tools20022.repository.choice.AuditTrailOrBusinessError2Choice;
import com.tools20022.repository.choice.DatePeriodSearch1Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SystemPartyIdentification3;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Report information about party reference data.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport3#mmPartyAuditTrailOrError
 * PartyAuditTrailReport3.mmPartyAuditTrailOrError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport3#mmDatePeriod
 * PartyAuditTrailReport3.mmDatePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport3#mmPartyIdentification
 * PartyAuditTrailReport3.mmPartyIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PartyAuditTrailReport3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Report information about party reference data."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport2
 * PartyAuditTrailReport2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PartyAuditTrailReport3", propOrder = {"partyAuditTrailOrError", "datePeriod", "partyIdentification"})
public class PartyAuditTrailReport3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PtyAudtTrlOrErr", required = true)
	protected AuditTrailOrBusinessError2Choice partyAuditTrailOrError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AuditTrailOrBusinessError2Choice
	 * AuditTrailOrBusinessError2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport3
	 * PartyAuditTrailReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyAudtTrlOrErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyAuditTrailOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the returned party reference data or error information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport2#mmPartyAuditTrailOrError
	 * PartyAuditTrailReport2.mmPartyAuditTrailOrError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyAuditTrailReport3, AuditTrailOrBusinessError2Choice> mmPartyAuditTrailOrError = new MMMessageAssociationEnd<PartyAuditTrailReport3, AuditTrailOrBusinessError2Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyAuditTrailReport3.mmObject();
			isDerived = false;
			xmlTag = "PtyAudtTrlOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyAuditTrailOrError";
			definition = "Identifies the returned party reference data or error information.";
			previousVersion_lazy = () -> PartyAuditTrailReport2.mmPartyAuditTrailOrError;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AuditTrailOrBusinessError2Choice.mmObject();
		}

		@Override
		public AuditTrailOrBusinessError2Choice getValue(PartyAuditTrailReport3 obj) {
			return obj.getPartyAuditTrailOrError();
		}

		@Override
		public void setValue(PartyAuditTrailReport3 obj, AuditTrailOrBusinessError2Choice value) {
			obj.setPartyAuditTrailOrError(value);
		}
	};
	@XmlElement(name = "DtPrd")
	protected DatePeriodSearch1Choice datePeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DatePeriodSearch1Choice
	 * DatePeriodSearch1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport3
	 * PartyAuditTrailReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period in dates for which the audit trail is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport2#mmDatePeriod
	 * PartyAuditTrailReport2.mmDatePeriod}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PartyAuditTrailReport3, Optional<DatePeriodSearch1Choice>> mmDatePeriod = new MMMessageAttribute<PartyAuditTrailReport3, Optional<DatePeriodSearch1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyAuditTrailReport3.mmObject();
			isDerived = false;
			xmlTag = "DtPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatePeriod";
			definition = "Period in dates for which the audit trail is provided.";
			previousVersion_lazy = () -> PartyAuditTrailReport2.mmDatePeriod;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DatePeriodSearch1Choice.mmObject();
		}

		@Override
		public Optional<DatePeriodSearch1Choice> getValue(PartyAuditTrailReport3 obj) {
			return obj.getDatePeriod();
		}

		@Override
		public void setValue(PartyAuditTrailReport3 obj, Optional<DatePeriodSearch1Choice> value) {
			obj.setDatePeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "PtyId", required = true)
	protected SystemPartyIdentification3 partyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification3
	 * SystemPartyIdentification3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport3
	 * PartyAuditTrailReport3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtyId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the party for which the audit trail is provided."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PartyAuditTrailReport2#mmPartyIdentification
	 * PartyAuditTrailReport2.mmPartyIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PartyAuditTrailReport3, SystemPartyIdentification3> mmPartyIdentification = new MMMessageAssociationEnd<PartyAuditTrailReport3, SystemPartyIdentification3>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.PartyAuditTrailReport3.mmObject();
			isDerived = false;
			xmlTag = "PtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartyIdentification";
			definition = "Identifies the party for which the audit trail is provided.";
			previousVersion_lazy = () -> PartyAuditTrailReport2.mmPartyIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification3.mmObject();
		}

		@Override
		public SystemPartyIdentification3 getValue(PartyAuditTrailReport3 obj) {
			return obj.getPartyIdentification();
		}

		@Override
		public void setValue(PartyAuditTrailReport3 obj, SystemPartyIdentification3 value) {
			obj.setPartyIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PartyAuditTrailReport3.mmPartyAuditTrailOrError, com.tools20022.repository.msg.PartyAuditTrailReport3.mmDatePeriod,
						com.tools20022.repository.msg.PartyAuditTrailReport3.mmPartyIdentification);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "PartyAuditTrailReport3";
				definition = "Report information about party reference data.";
				previousVersion_lazy = () -> PartyAuditTrailReport2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public AuditTrailOrBusinessError2Choice getPartyAuditTrailOrError() {
		return partyAuditTrailOrError;
	}

	public PartyAuditTrailReport3 setPartyAuditTrailOrError(AuditTrailOrBusinessError2Choice partyAuditTrailOrError) {
		this.partyAuditTrailOrError = Objects.requireNonNull(partyAuditTrailOrError);
		return this;
	}

	public Optional<DatePeriodSearch1Choice> getDatePeriod() {
		return datePeriod == null ? Optional.empty() : Optional.of(datePeriod);
	}

	public PartyAuditTrailReport3 setDatePeriod(DatePeriodSearch1Choice datePeriod) {
		this.datePeriod = datePeriod;
		return this;
	}

	public SystemPartyIdentification3 getPartyIdentification() {
		return partyIdentification;
	}

	public PartyAuditTrailReport3 setPartyIdentification(SystemPartyIdentification3 partyIdentification) {
		this.partyIdentification = Objects.requireNonNull(partyIdentification);
		return this;
	}
}