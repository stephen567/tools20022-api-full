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
import com.tools20022.repository.entity.Reservation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ErrorHandling3;
import com.tools20022.repository.msg.Reservation1;
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
 * Reports either on the reservation or on a business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReservationOrError3Choice#mmReservation
 * ReservationOrError3Choice.mmReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReservationOrError3Choice#mmBusinessError
 * ReservationOrError3Choice.mmBusinessError}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Reservation
 * Reservation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReservationOrError3Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reports either on the reservation or on a business error."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.ReservationOrError5Choice
 * ReservationOrError5Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReservationOrError3Choice", propOrder = {"reservation", "businessError"})
public class ReservationOrError3Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rsvatn", required = true)
	protected Reservation1 reservation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Reservation1
	 * Reservation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReservationOrError3Choice
	 * ReservationOrError3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsvatn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested information on the limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReservationOrError5Choice#mmReservation
	 * ReservationOrError5Choice.mmReservation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReservationOrError3Choice, Reservation1> mmReservation = new MMMessageAssociationEnd<ReservationOrError3Choice, Reservation1>() {
		{
			businessComponentTrace_lazy = () -> Reservation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.ReservationOrError3Choice.mmObject();
			isDerived = false;
			xmlTag = "Rsvatn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reservation";
			definition = "Requested information on the limit.";
			nextVersions_lazy = () -> Arrays.asList(ReservationOrError5Choice.mmReservation);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Reservation1.mmObject();
		}

		@Override
		public Reservation1 getValue(ReservationOrError3Choice obj) {
			return obj.getReservation();
		}

		@Override
		public void setValue(ReservationOrError3Choice obj, Reservation1 value) {
			obj.setReservation(value);
		}
	};
	@XmlElement(name = "BizErr", required = true)
	protected List<ErrorHandling3> businessError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling3
	 * ErrorHandling3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReservationOrError3Choice
	 * ReservationOrError3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason the requested business information is not given."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ReservationOrError5Choice#mmBusinessError
	 * ReservationOrError5Choice.mmBusinessError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReservationOrError3Choice, List<ErrorHandling3>> mmBusinessError = new MMMessageAssociationEnd<ReservationOrError3Choice, List<ErrorHandling3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.ReservationOrError3Choice.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Reason the requested business information is not given.";
			nextVersions_lazy = () -> Arrays.asList(ReservationOrError5Choice.mmBusinessError);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ErrorHandling3.mmObject();
		}

		@Override
		public List<ErrorHandling3> getValue(ReservationOrError3Choice obj) {
			return obj.getBusinessError();
		}

		@Override
		public void setValue(ReservationOrError3Choice obj, List<ErrorHandling3> value) {
			obj.setBusinessError(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ReservationOrError3Choice.mmReservation, com.tools20022.repository.choice.ReservationOrError3Choice.mmBusinessError);
				trace_lazy = () -> Reservation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ReservationOrError3Choice";
				definition = "Reports either on the reservation or on a business error.";
				nextVersions_lazy = () -> Arrays.asList(ReservationOrError5Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Reservation1 getReservation() {
		return reservation;
	}

	public ReservationOrError3Choice setReservation(Reservation1 reservation) {
		this.reservation = Objects.requireNonNull(reservation);
		return this;
	}

	public List<ErrorHandling3> getBusinessError() {
		return businessError == null ? businessError = new ArrayList<>() : businessError;
	}

	public ReservationOrError3Choice setBusinessError(List<ErrorHandling3> businessError) {
		this.businessError = Objects.requireNonNull(businessError);
		return this;
	}
}