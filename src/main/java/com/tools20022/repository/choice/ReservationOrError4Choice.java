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
import com.tools20022.repository.entity.Reservation;
import com.tools20022.repository.msg.CurrentAndDefaultReservation2;
import com.tools20022.repository.msg.ErrorHandling4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * It is used to provide confirmation details of one or more reservations set by
 * the member (or on behalf of the member) and managed by the transaction
 * administrator.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReservationOrError4Choice#BusinessReport
 * ReservationOrError4Choice.BusinessReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.ReservationOrError4Choice#OperationalError
 * ReservationOrError4Choice.OperationalError}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReservationOrError4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "It is used to provide confirmation details of one or more reservations set by the member (or on behalf of the member) and managed by the transaction administrator."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.ReservationOrError2Choice
 * ReservationOrError2Choice}</li>
 * </ul>
 */
public class ReservationOrError4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reports on reservations.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation2
	 * CurrentAndDefaultReservation2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReservationOrError4Choice
	 * ReservationOrError4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reports on reservations."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ReservationOrError2Choice#BusinessReport
	 * ReservationOrError2Choice.BusinessReport}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd BusinessReport = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReservationOrError4Choice.mmObject();
			businessComponentTrace_lazy = () -> Reservation.mmObject();
			isDerived = false;
			xmlTag = "BizRpt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessReport";
			definition = "Reports on reservations.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.ReservationOrError2Choice.BusinessReport;
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CurrentAndDefaultReservation2.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Indicates that an operational error has been issued during the processing
	 * of the related request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ErrorHandling4
	 * ErrorHandling4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.ReservationOrError4Choice
	 * ReservationOrError4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OprlErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OperationalError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that an operational error has been issued during the processing of the related request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.ReservationOrError2Choice#OperationalError
	 * ReservationOrError2Choice.OperationalError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd OperationalError = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ReservationOrError4Choice.mmObject();
			isDerived = false;
			xmlTag = "OprlErr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OperationalError";
			definition = "Indicates that an operational error has been issued during the processing of the related request.";
			previousVersion_lazy = () -> com.tools20022.repository.choice.ReservationOrError2Choice.OperationalError;
			minOccurs = 1;
			type_lazy = () -> ErrorHandling4.mmObject();
			isComposite = true;
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.ReservationOrError4Choice.BusinessReport, com.tools20022.repository.choice.ReservationOrError4Choice.OperationalError);
				trace_lazy = () -> Reservation.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ReservationOrError4Choice";
				definition = "It is used to provide confirmation details of one or more reservations set by the member (or on behalf of the member) and managed by the transaction administrator.";
				previousVersion_lazy = () -> ReservationOrError2Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}