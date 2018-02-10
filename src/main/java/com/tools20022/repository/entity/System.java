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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.ext.OtherSemanticMarkup;
import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.ATMCommandParameters1Choice;
import com.tools20022.repository.codeset.ISO2ALanguageCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.RolePlayer;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Set of integrated applications that provides centralised services such as
 * clearing, netting, reconciliation, trading and/or settlement.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="System" src="doc-files/System.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.RolePlayer
 * RolePlayer}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.System#mmSystemIdentification
 * System.mmSystemIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmLocation
 * System.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmReconciliation
 * System.mmReconciliation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmAvailability
 * System.mmAvailability}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmEvent
 * System.mmEvent}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmPartyRole
 * System.mmPartyRole}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmStatus
 * System.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.System#mmSystemGeneratedInformation
 * System.mmSystemGeneratedInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.System#mmVersionValidityPeriod
 * System.mmVersionValidityPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmSystemDateTime
 * System.mmSystemDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmNegotiation
 * System.mmNegotiation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmAccount
 * System.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmTrade
 * System.mmTrade}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmAssessment
 * System.mmAssessment}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmTradesPosition
 * System.mmTradesPosition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.System#mmSystemLanguage
 * System.mmSystemLanguage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmSystem
 * Account.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Location#mmSystem
 * Location.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Trade#mmSystem
 * Trade.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSystem
 * DateTimePeriod.mmSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentificationForSystem
 * SystemIdentification.mmIdentificationForSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemPartyRole#mmRelatedSystem
 * SystemPartyRole.mmRelatedSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmSystem
 * SystemEventInformation.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemStatus#mmSystem
 * SystemStatus.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SystemAvailability#mmSystem
 * SystemAvailability.mmSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmSystem
 * SystemBusinessInformation.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Negotiation#mmTradingSystem
 * Negotiation.mmTradingSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Reconciliation#mmSystem
 * Reconciliation.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Assessment#mmSystem
 * Assessment.mmSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#mmSystem
 * Position.mmSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction3#mmPaymentTo
 * Transaction3.mmPaymentTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction3#mmPaymentFrom
 * Transaction3.mmPaymentFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction4#mmPaymentTo
 * Transaction4.mmPaymentTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction4#mmPaymentFrom
 * Transaction4.mmPaymentFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction5#mmPaymentTo
 * Transaction5.mmPaymentTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction5#mmPaymentFrom
 * Transaction5.mmPaymentFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction24#mmPaymentTo
 * Transaction24.mmPaymentTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction24#mmPaymentFrom
 * Transaction24.mmPaymentFrom}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction33#mmPaymentTo
 * Transaction33.mmPaymentTo}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transaction33#mmPaymentFrom
 * Transaction33.mmPaymentFrom}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.ClearingSystem
 * ClearingSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesSettlementSystem
 * SecuritiesSettlementSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.PointOfInteraction
 * PointOfInteraction}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TerminalManagementSystem
 * TerminalManagementSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.MatchingSystem
 * MatchingSystem}</li>
 * <li>{@linkplain com.tools20022.repository.entity.TreasurySettlementSystem
 * TreasurySettlementSystem}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.SystemDetails1 SystemDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemSearch2 SystemSearch2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemSearch3 SystemSearch3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEventsDetails1
 * SystemAvailabilityAndEventsDetails1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemAvailabilityAndEvents1
 * SystemAvailabilityAndEvents1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SystemDetails2 SystemDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.System1 System1}</li>
 * </ul>
 * </li>
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
 * "System"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of integrated applications that provides centralised services such as clearing, netting, reconciliation, trading and/or settlement."
 * </li>
 * </ul>
 */
public class System extends RolePlayer {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected SystemIdentification systemIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification#mmIdentificationForSystem
	 * SystemIdentification.mmIdentificationForSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SystemIdentification
	 * SystemIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemDetails1#mmSystemIdentification
	 * SystemDetails1.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationIdentificationDetails1#mmSystemIdentification
	 * ReservationIdentificationDetails1.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationIdentification1#mmSystemIdentification
	 * ReservationIdentification1.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria1#mmSystemIdentification
	 * ReservationSearchCriteria1.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationSearchCriteria2#mmSystemIdentification
	 * ReservationSearchCriteria2.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemSearch3#mmSystemIdentification
	 * SystemSearch3.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SystemDetails2#mmSystemIdentification
	 * SystemDetails2.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.System1#mmSystemIdentification
	 * System1.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration1#mmHostIdentification
	 * AcquirerHostConfiguration1.mmHostIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter1#mmHostIdentification
	 * HostCommunicationParameter1.mmHostIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration1#mmPOIIdentification
	 * AcceptorConfiguration1.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration1#mmTerminalManagerIdentification
	 * AcceptorConfiguration1.mmTerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration2#mmHostIdentification
	 * AcquirerHostConfiguration2.mmHostIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter2#mmHostIdentification
	 * HostCommunicationParameter2.mmHostIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration2#mmPOIIdentification
	 * AcceptorConfiguration2.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration2#mmTerminalManagerIdentification
	 * AcceptorConfiguration2.mmTerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration3#mmPOIIdentification
	 * AcceptorConfiguration3.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration3#mmTerminalManagerIdentification
	 * AcceptorConfiguration3.mmTerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration4#mmPOIIdentification
	 * AcceptorConfiguration4.mmPOIIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration4#mmTerminalManagerIdentification
	 * AcceptorConfiguration4.mmTerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration3#mmHostIdentification
	 * AcquirerHostConfiguration3.mmHostIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter3#mmHostIdentification
	 * HostCommunicationParameter3.mmHostIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCompletionAcknowledgement1#mmATM
	 * ATMCompletionAcknowledgement1.mmATM}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAcceptorTerminal1#mmIdentification
	 * CardAcceptorTerminal1.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration5#mmTerminalManagerIdentification
	 * AcceptorConfiguration5.mmTerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.HostCommunicationParameter4#mmHostIdentification
	 * HostCommunicationParameter4.mmHostIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ATMCompletionAcknowledgement2#mmATM
	 * ATMCompletionAcknowledgement2.mmATM}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorConfiguration6#mmTerminalManagerIdentification
	 * AcceptorConfiguration6.mmTerminalManagerIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration4#mmHostIdentification
	 * AcquirerHostConfiguration4.mmHostIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSystemIdentification = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SystemDetails1.mmSystemIdentification, ReservationIdentificationDetails1.mmSystemIdentification, ReservationIdentification1.mmSystemIdentification,
					ReservationSearchCriteria1.mmSystemIdentification, ReservationSearchCriteria2.mmSystemIdentification, SystemSearch3.mmSystemIdentification, SystemDetails2.mmSystemIdentification, System1.mmSystemIdentification,
					AcquirerHostConfiguration1.mmHostIdentification, HostCommunicationParameter1.mmHostIdentification, AcceptorConfiguration1.mmPOIIdentification, AcceptorConfiguration1.mmTerminalManagerIdentification,
					AcquirerHostConfiguration2.mmHostIdentification, HostCommunicationParameter2.mmHostIdentification, AcceptorConfiguration2.mmPOIIdentification, AcceptorConfiguration2.mmTerminalManagerIdentification,
					AcceptorConfiguration3.mmPOIIdentification, AcceptorConfiguration3.mmTerminalManagerIdentification, AcceptorConfiguration4.mmPOIIdentification, AcceptorConfiguration4.mmTerminalManagerIdentification,
					AcquirerHostConfiguration3.mmHostIdentification, HostCommunicationParameter3.mmHostIdentification, ATMCompletionAcknowledgement1.mmATM, CardAcceptorTerminal1.mmIdentification,
					AcceptorConfiguration5.mmTerminalManagerIdentification, HostCommunicationParameter4.mmHostIdentification, ATMCompletionAcknowledgement2.mmATM, AcceptorConfiguration6.mmTerminalManagerIdentification,
					AcquirerHostConfiguration4.mmHostIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SystemIdentification";
			definition = "Identification of the system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmIdentificationForSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemIdentification.mmObject();
		}
	};
	protected Location location;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Location#mmSystem
	 * Location.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Location Location}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SystemSearch2#mmCountry
	 * SystemSearch2.mmCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine3#mmLocation
	 * AutomatedTellerMachine3.mmLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine4#mmLocation
	 * AutomatedTellerMachine4.mmLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardAcceptorTerminal1#mmLocation
	 * CardAcceptorTerminal1.mmLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AutomatedTellerMachine10#mmLocation
	 * AutomatedTellerMachine10.mmLocation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Location, address and country in which the system is located."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLocation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(SystemSearch2.mmCountry, AutomatedTellerMachine3.mmLocation, AutomatedTellerMachine4.mmLocation, CardAcceptorTerminal1.mmLocation, AutomatedTellerMachine10.mmLocation);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Location";
			definition = "Location, address and country in which the system is located.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Location.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Location.mmObject();
		}
	};
	protected Reconciliation reconciliation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Reconciliation#mmSystem
	 * Reconciliation.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Reconciliation
	 * Reconciliation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reconciliation process provided by the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReconciliation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reconciliation";
			definition = "Reconciliation process provided by the system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Reconciliation.mmObject();
		}
	};
	protected SystemAvailability availability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemAvailability#mmSystem
	 * SystemAvailability.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemAvailability
	 * SystemAvailability}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ParticipantAndStatus1#mmServiceAvailability
	 * ParticipantAndStatus1.mmServiceAvailability}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Availability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the activity or non-activity of the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAvailability = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ParticipantAndStatus1.mmServiceAvailability);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Availability";
			definition = "Information about the activity or non-activity of the system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemAvailability.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemAvailability.mmObject();
		}
	};
	protected SystemEventInformation event;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation#mmSystem
	 * SystemEventInformation.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SystemEventInformation
	 * SystemEventInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Event"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specific point in time associated with the system's processing cycle. Operations of a system are composed of a series of processes, the closing, or completion, of which constitutes an event with an associated time stamp. An event may have a series of time stamps associated with it, such as the scheduled and effective completion times."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Event";
			definition = "Specific point in time associated with the system's processing cycle. Operations of a system are composed of a series of processes, the closing, or completion, of which constitutes an event with an associated time stamp. An event may have a series of time stamps associated with it, such as the scheduled and effective completion times.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemEventInformation.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemEventInformation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SystemPartyRole> partyRole;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemPartyRole#mmRelatedSystem
	 * SystemPartyRole.mmRelatedSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemPartyRole
	 * SystemPartyRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation2#mmAccountOwner
	 * IntraBalanceCancellation2.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceCancellation1#mmAccountOwner
	 * IntraBalanceCancellation1.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovement1#mmAccountOwner
	 * IntraBalanceMovement1.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceMovements1#mmAccountOwner
	 * IntraBalanceMovements1.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovement1#mmAccountOwner
	 * IntraPositionMovement1.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionMovements1#mmAccountOwner
	 * IntraPositionMovements1.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionQueryCriteria1#mmSafekeepingAccountOwner
	 * IntraPositionQueryCriteria1.mmSafekeepingAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification2#mmAccountOwner
	 * IntraBalanceModification2.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceModification1#mmAccountOwner
	 * IntraBalanceModification1.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria3#mmCashAccountOwner
	 * IntraBalanceQueryCriteria3.mmCashAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification2#mmAccountOwner
	 * IntraPositionModification2.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionModification1#mmAccountOwner
	 * IntraPositionModification1.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation2#mmAccountOwner
	 * IntraPositionCancellation2.mmAccountOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.IntraPositionCancellation1#mmAccountOwner
	 * IntraPositionCancellation1.mmAccountOwner}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies each role linked to a system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPartyRole = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(IntraBalanceCancellation2.mmAccountOwner, IntraBalanceCancellation1.mmAccountOwner, IntraBalanceMovement1.mmAccountOwner, IntraBalanceMovements1.mmAccountOwner,
					IntraPositionMovement1.mmAccountOwner, IntraPositionMovements1.mmAccountOwner, IntraPositionQueryCriteria1.mmSafekeepingAccountOwner, IntraBalanceModification2.mmAccountOwner, IntraBalanceModification1.mmAccountOwner,
					IntraBalanceQueryCriteria3.mmCashAccountOwner, IntraPositionModification2.mmAccountOwner, IntraPositionModification1.mmAccountOwner, IntraPositionCancellation2.mmAccountOwner, IntraPositionCancellation1.mmAccountOwner);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartyRole";
			definition = "Specifies each role linked to a system.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemPartyRole.mmRelatedSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemPartyRole.mmObject();
		}
	};
	protected SystemStatus status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemStatus#mmSystem
	 * SystemStatus.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemStatus
	 * SystemStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.ATMCommandParameters1Choice#mmATMRequiredGlobalStatus
	 * ATMCommandParameters1Choice.mmATMRequiredGlobalStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStatus = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(ATMCommandParameters1Choice.mmATMRequiredGlobalStatus);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Status of the system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemStatus.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemStatus.mmObject();
		}
	};
	protected SystemBusinessInformation systemGeneratedInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmSystem
	 * SystemBusinessInformation.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
	 * SystemBusinessInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemGeneratedInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Business details provided for an information system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSystemGeneratedInformation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SystemGeneratedInformation";
			definition = "Business details provided for an information system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SystemBusinessInformation.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SystemBusinessInformation.mmObject();
		}
	};
	protected DateTimePeriod versionValidityPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmSystem
	 * DateTimePeriod.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = type=SampleData, SampleData=<?xml version="1.0"
	 * encoding="UTF-8"?> <InstanceInfo> <key KeyValue="Sample1"/> <key
	 * KeyValue="Sample2"/> <key KeyValue="Sample3"/> <key KeyValue="Sample4"/>
	 * <key KeyValue="Sample5"/> <key KeyValue="Sample6"/> <key
	 * KeyValue="Sample7"/> <key KeyValue="Sample8"/> <key KeyValue="Sample9"/>
	 * <key KeyValue="Sample10"/> </InstanceInfo>
	 * 
	 * 
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VersionValidityPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date at, or period of time during which, the stipulated version is in effect."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmVersionValidityPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			semanticMarkup_lazy = () -> Arrays
					.asList(new OtherSemanticMarkup(
							this,
							"SampleData",
							new String[]{
									"SampleData",
									"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<InstanceInfo>\n<key KeyValue=\"Sample1\"/>\n<key KeyValue=\"Sample2\"/>\n<key KeyValue=\"Sample3\"/>\n<key KeyValue=\"Sample4\"/>\n<key KeyValue=\"Sample5\"/>\n<key KeyValue=\"Sample6\"/>\n<key KeyValue=\"Sample7\"/>\n<key KeyValue=\"Sample8\"/>\n<key KeyValue=\"Sample9\"/>\n<key KeyValue=\"Sample10\"/>\n</InstanceInfo>\n\n\n"}));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VersionValidityPeriod";
			definition = "Date at, or period of time during which, the stipulated version is in effect.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected ISODateTime systemDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date time of a system performing a task."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSystemDateTime = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SystemDateTime";
			definition = "Date time of a system performing a task.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return System.class.getMethod("getSystemDateTime", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Negotiation negotiation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Negotiation#mmTradingSystem
	 * Negotiation.mmTradingSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Negotiation
	 * Negotiation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Negotiation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Negotiation process which uses a ssystem."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNegotiation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Negotiation";
			definition = "Negotiation process which uses a ssystem.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Negotiation.mmTradingSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Negotiation.mmObject();
		}
	};
	protected Account account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmSystem
	 * Account.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account managed by a system and held by a system member."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Account managed by a system and held by a system member.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected Trade trade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Trade#mmSystem
	 * Trade.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Trade Trade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade processed by a system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Trade processed by a system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Trade.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Trade.mmObject();
		}
	};
	protected Assessment assessment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Assessment#mmSystem
	 * Assessment.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Assessment
	 * Assessment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assessment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Assessment associated with a system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAssessment = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Assessment";
			definition = "Assessment associated with a system.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Assessment.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Assessment.mmObject();
		}
	};
	protected Position tradesPosition;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Position#mmSystem
	 * Position.mmSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Position Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradesPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of trades and their value inside a system."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTradesPosition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradesPosition";
			definition = "Specifies the status of trades and their value inside a system.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Position.mmSystem;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
		}
	};
	protected ISO2ALanguageCode systemLanguage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ISO2ALanguageCode
	 * ISO2ALanguageCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} = {@linkplain com.tools20022.repository.entity.System
	 * System}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemLanguage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the language used by the system."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSystemLanguage = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.System.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemLanguage";
			definition = "Specifies the language used by the system.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISO2ALanguageCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return System.class.getMethod("getSystemLanguage", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "System";
				definition = "Set of integrated applications that provides centralised services such as clearing, netting, reconciliation, trading and/or settlement.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmSystem, com.tools20022.repository.entity.Location.mmSystem, com.tools20022.repository.entity.Trade.mmSystem,
						com.tools20022.repository.entity.DateTimePeriod.mmSystem, com.tools20022.repository.entity.SystemIdentification.mmIdentificationForSystem, com.tools20022.repository.entity.SystemPartyRole.mmRelatedSystem,
						com.tools20022.repository.entity.SystemEventInformation.mmSystem, com.tools20022.repository.entity.SystemStatus.mmSystem, com.tools20022.repository.entity.SystemAvailability.mmSystem,
						com.tools20022.repository.entity.SystemBusinessInformation.mmSystem, com.tools20022.repository.entity.Negotiation.mmTradingSystem, com.tools20022.repository.entity.Reconciliation.mmSystem,
						com.tools20022.repository.entity.Assessment.mmSystem, com.tools20022.repository.entity.Position.mmSystem);
				derivationElement_lazy = () -> Arrays.asList(Transaction3.mmPaymentTo, Transaction3.mmPaymentFrom, Transaction4.mmPaymentTo, Transaction4.mmPaymentFrom, Transaction5.mmPaymentTo, Transaction5.mmPaymentFrom,
						Transaction24.mmPaymentTo, Transaction24.mmPaymentFrom, Transaction33.mmPaymentTo, Transaction33.mmPaymentFrom);
				subType_lazy = () -> Arrays.asList(ClearingSystem.mmObject(), SecuritiesSettlementSystem.mmObject(), PointOfInteraction.mmObject(), TerminalManagementSystem.mmObject(), MatchingSystem.mmObject(),
						TreasurySettlementSystem.mmObject());
				superType_lazy = () -> RolePlayer.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.System.mmSystemIdentification, com.tools20022.repository.entity.System.mmLocation, com.tools20022.repository.entity.System.mmReconciliation,
						com.tools20022.repository.entity.System.mmAvailability, com.tools20022.repository.entity.System.mmEvent, com.tools20022.repository.entity.System.mmPartyRole, com.tools20022.repository.entity.System.mmStatus,
						com.tools20022.repository.entity.System.mmSystemGeneratedInformation, com.tools20022.repository.entity.System.mmVersionValidityPeriod, com.tools20022.repository.entity.System.mmSystemDateTime,
						com.tools20022.repository.entity.System.mmNegotiation, com.tools20022.repository.entity.System.mmAccount, com.tools20022.repository.entity.System.mmTrade, com.tools20022.repository.entity.System.mmAssessment,
						com.tools20022.repository.entity.System.mmTradesPosition, com.tools20022.repository.entity.System.mmSystemLanguage);
				derivationComponent_lazy = () -> Arrays.asList(SystemDetails1.mmObject(), SystemSearch2.mmObject(), SystemSearch3.mmObject(), SystemAvailabilityAndEventsDetails1.mmObject(), SystemAvailabilityAndEvents1.mmObject(),
						SystemDetails2.mmObject(), System1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return System.class;
			}
		});
		return mmObject_lazy.get();
	}

	public SystemIdentification getSystemIdentification() {
		return systemIdentification;
	}

	public System setSystemIdentification(com.tools20022.repository.entity.SystemIdentification systemIdentification) {
		this.systemIdentification = Objects.requireNonNull(systemIdentification);
		return this;
	}

	public Location getLocation() {
		return location;
	}

	public System setLocation(com.tools20022.repository.entity.Location location) {
		this.location = Objects.requireNonNull(location);
		return this;
	}

	public Reconciliation getReconciliation() {
		return reconciliation;
	}

	public System setReconciliation(com.tools20022.repository.entity.Reconciliation reconciliation) {
		this.reconciliation = Objects.requireNonNull(reconciliation);
		return this;
	}

	public SystemAvailability getAvailability() {
		return availability;
	}

	public System setAvailability(com.tools20022.repository.entity.SystemAvailability availability) {
		this.availability = Objects.requireNonNull(availability);
		return this;
	}

	public SystemEventInformation getEvent() {
		return event;
	}

	public System setEvent(com.tools20022.repository.entity.SystemEventInformation event) {
		this.event = Objects.requireNonNull(event);
		return this;
	}

	public List<SystemPartyRole> getPartyRole() {
		return partyRole == null ? partyRole = new ArrayList<>() : partyRole;
	}

	public System setPartyRole(List<com.tools20022.repository.entity.SystemPartyRole> partyRole) {
		this.partyRole = Objects.requireNonNull(partyRole);
		return this;
	}

	public SystemStatus getStatus() {
		return status;
	}

	public System setStatus(com.tools20022.repository.entity.SystemStatus status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public SystemBusinessInformation getSystemGeneratedInformation() {
		return systemGeneratedInformation;
	}

	public System setSystemGeneratedInformation(com.tools20022.repository.entity.SystemBusinessInformation systemGeneratedInformation) {
		this.systemGeneratedInformation = Objects.requireNonNull(systemGeneratedInformation);
		return this;
	}

	public DateTimePeriod getVersionValidityPeriod() {
		return versionValidityPeriod;
	}

	public System setVersionValidityPeriod(com.tools20022.repository.entity.DateTimePeriod versionValidityPeriod) {
		this.versionValidityPeriod = Objects.requireNonNull(versionValidityPeriod);
		return this;
	}

	public ISODateTime getSystemDateTime() {
		return systemDateTime;
	}

	public System setSystemDateTime(ISODateTime systemDateTime) {
		this.systemDateTime = Objects.requireNonNull(systemDateTime);
		return this;
	}

	public Optional<Negotiation> getNegotiation() {
		return negotiation == null ? Optional.empty() : Optional.of(negotiation);
	}

	public System setNegotiation(com.tools20022.repository.entity.Negotiation negotiation) {
		this.negotiation = negotiation;
		return this;
	}

	public Account getAccount() {
		return account;
	}

	public System setAccount(com.tools20022.repository.entity.Account account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public Trade getTrade() {
		return trade;
	}

	public System setTrade(com.tools20022.repository.entity.Trade trade) {
		this.trade = Objects.requireNonNull(trade);
		return this;
	}

	public Optional<Assessment> getAssessment() {
		return assessment == null ? Optional.empty() : Optional.of(assessment);
	}

	public System setAssessment(com.tools20022.repository.entity.Assessment assessment) {
		this.assessment = assessment;
		return this;
	}

	public Position getTradesPosition() {
		return tradesPosition;
	}

	public System setTradesPosition(com.tools20022.repository.entity.Position tradesPosition) {
		this.tradesPosition = Objects.requireNonNull(tradesPosition);
		return this;
	}

	public ISO2ALanguageCode getSystemLanguage() {
		return systemLanguage;
	}

	public System setSystemLanguage(ISO2ALanguageCode systemLanguage) {
		this.systemLanguage = Objects.requireNonNull(systemLanguage);
		return this;
	}
}