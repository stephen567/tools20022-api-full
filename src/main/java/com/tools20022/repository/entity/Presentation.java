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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.Channel1Choice;
import com.tools20022.repository.choice.CommunicationMethod1Choice;
import com.tools20022.repository.choice.PresentationMedium1Choice;
import com.tools20022.repository.codeset.CommunicationMethodCode;
import com.tools20022.repository.codeset.ExternalChannelCode;
import com.tools20022.repository.codeset.PresentationMediumCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Presentation of documents.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Presentation" src="doc-files/Presentation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#CommunicationMethod
 * Presentation.CommunicationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#PresentedUndertaking
 * Presentation.PresentedUndertaking}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Presentation#Medium
 * Presentation.Medium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#PresentedDocument
 * Presentation.PresentedDocument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#ElectronicPresentationAddress
 * Presentation.ElectronicPresentationAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#PresentationDate
 * Presentation.PresentationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Presentation#ApplicableChannel
 * Presentation.ApplicableChannel}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#RelatedPresentation
 * ElectronicAddress.RelatedPresentation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Document#Presentation
 * Document.Presentation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Undertaking#Presentation
 * Undertaking.Presentation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.CommunicationMethod1Choice
 * CommunicationMethod1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CommunicationChannel1
 * CommunicationChannel1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PresentationMedium1Choice
 * PresentationMedium1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Channel1Choice
 * Channel1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Presentation3 Presentation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Presentation4 Presentation4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Presentation2 Presentation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Presentation1 Presentation1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RegisteredContractCommunication1
 * RegisteredContractCommunication1}</li>
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
 * "Presentation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Presentation of documents."</li>
 * </ul>
 */
public class Presentation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Method by which the document is to be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ExternalChannelCode
	 * ExternalChannelCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.choice.Channel2Choice#Code
	 * Channel2Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Channel2Choice#Proprietary
	 * Channel2Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommunicationMethod1Choice#Code
	 * CommunicationMethod1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.CommunicationMethod1Choice#Proprietary
	 * CommunicationMethod1Choice.Proprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NonExtension1#NotificationMethod
	 * NonExtension1.NotificationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CommunicationChannel1#Method
	 * CommunicationChannel1.Method}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking11#DeliveryChannel
	 * Undertaking11.DeliveryChannel}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Amendment1#DeliveryChannel
	 * Amendment1.DeliveryChannel}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Amendment3#DeliveryChannel
	 * Amendment3.DeliveryChannel}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Channel1Choice#Code
	 * Channel1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.Channel1Choice#Proprietary
	 * Channel1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Presentation3#Channel
	 * Presentation3.Channel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Document10#PresentationChannel
	 * Document10.PresentationChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking1#DeliveryChannel
	 * Undertaking1.DeliveryChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking4#DeliveryChannel
	 * Undertaking4.DeliveryChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Undertaking3#DeliveryChannel
	 * Undertaking3.DeliveryChannel}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractCommunication1#Method
	 * RegisteredContractCommunication1.Method}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommunicationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method by which the document is to be delivered."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute CommunicationMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Channel2Choice.Code, com.tools20022.repository.choice.Channel2Choice.Proprietary, com.tools20022.repository.choice.CommunicationMethod1Choice.Code,
					com.tools20022.repository.choice.CommunicationMethod1Choice.Proprietary, com.tools20022.repository.msg.NonExtension1.NotificationMethod, com.tools20022.repository.msg.CommunicationChannel1.Method,
					com.tools20022.repository.msg.Undertaking11.DeliveryChannel, com.tools20022.repository.msg.Amendment1.DeliveryChannel, com.tools20022.repository.msg.Amendment3.DeliveryChannel,
					com.tools20022.repository.choice.Channel1Choice.Code, com.tools20022.repository.choice.Channel1Choice.Proprietary, com.tools20022.repository.msg.Presentation3.Channel,
					com.tools20022.repository.msg.Document10.PresentationChannel, com.tools20022.repository.msg.Undertaking1.DeliveryChannel, com.tools20022.repository.msg.Undertaking4.DeliveryChannel,
					com.tools20022.repository.msg.Undertaking3.DeliveryChannel, com.tools20022.repository.msg.RegisteredContractCommunication1.Method);
			elementContext_lazy = () -> Presentation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CommunicationMethod";
			definition = "Method by which the document is to be delivered.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ExternalChannelCode.mmObject();
		}
	};
	/**
	 * Specifies the undertaking which is presented and its associated
	 * documents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#Presentation
	 * Undertaking.Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Undertaking
	 * Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentedUndertaking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the undertaking which is presented and its associated documents."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PresentedUndertaking = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> Presentation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PresentedUndertaking";
			definition = "Specifies the undertaking which is presented and its associated documents.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> Undertaking.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Undertaking.Presentation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Medium through which the presentation can be submitted such as paper,
	 * electronic or both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PresentationMediumCode
	 * PresentationMediumCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PresentationMedium1Choice#Code
	 * PresentationMedium1Choice.Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PresentationMedium1Choice#Proprietary
	 * PresentationMedium1Choice.Proprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Presentation4#Medium
	 * Presentation4.Medium}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Presentation1#Medium
	 * Presentation1.Medium}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice2#OriginalIssuedMedium
	 * UndertakingAdvice2.OriginalIssuedMedium}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Medium"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Medium through which the presentation can be submitted such as paper, electronic or both."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Medium = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PresentationMedium1Choice.Code, com.tools20022.repository.choice.PresentationMedium1Choice.Proprietary, com.tools20022.repository.msg.Presentation4.Medium,
					com.tools20022.repository.msg.Presentation1.Medium, com.tools20022.repository.msg.UndertakingAdvice2.OriginalIssuedMedium);
			elementContext_lazy = () -> Presentation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Medium";
			definition = "Medium through which the presentation can be submitted such as paper, electronic or both.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> PresentationMediumCode.mmObject();
		}
	};
	/**
	 * Documents which are presented.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Document#Presentation
	 * Document.Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Document Document}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Presentation4#Document
	 * Presentation4.Document}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Presentation1#Document
	 * Presentation1.Document}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentedDocument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Documents which are presented."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd PresentedDocument = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Presentation4.Document, com.tools20022.repository.msg.Presentation1.Document);
			elementContext_lazy = () -> Presentation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PresentedDocument";
			definition = "Documents which are presented.";
			minOccurs = 1;
			type_lazy = () -> Document.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Document.Presentation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Electronic address for the presentation of documents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ElectronicAddress#RelatedPresentation
	 * ElectronicAddress.RelatedPresentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ElectronicAddress
	 * ElectronicAddress}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Presentation3#Address
	 * Presentation3.Address}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicPresentationAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Electronic address for the presentation of documents."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd ElectronicPresentationAddress = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Presentation3.Address);
			elementContext_lazy = () -> Presentation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ElectronicPresentationAddress";
			definition = "Electronic address for the presentation of documents.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> ElectronicAddress.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.ElectronicAddress.RelatedPresentation;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Date on which the presentation is made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Presentation2#BeneficiaryPresentationDate
	 * Presentation2.BeneficiaryPresentationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RegisteredContractCommunication1#Date
	 * RegisteredContractCommunication1.Date}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the presentation is made."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute PresentationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Presentation2.BeneficiaryPresentationDate, com.tools20022.repository.msg.RegisteredContractCommunication1.Date);
			elementContext_lazy = () -> Presentation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "PresentationDate";
			definition = "Date on which the presentation is made.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Channel used for the transmission of a document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CommunicationMethodCode
	 * CommunicationMethodCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Presentation Presentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Channel used for the transmission of a document."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ApplicableChannel = new MMBusinessAttribute() {
		{
			elementContext_lazy = () -> Presentation.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ApplicableChannel";
			definition = "Channel used for the transmission of a document.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CommunicationMethodCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "Presentation";
				definition = "Presentation of documents.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ElectronicAddress.RelatedPresentation, com.tools20022.repository.entity.Document.Presentation,
						com.tools20022.repository.entity.Undertaking.Presentation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Presentation.CommunicationMethod, com.tools20022.repository.entity.Presentation.PresentedUndertaking, com.tools20022.repository.entity.Presentation.Medium,
						com.tools20022.repository.entity.Presentation.PresentedDocument, com.tools20022.repository.entity.Presentation.ElectronicPresentationAddress, com.tools20022.repository.entity.Presentation.PresentationDate,
						com.tools20022.repository.entity.Presentation.ApplicableChannel);
				derivationComponent_lazy = () -> Arrays.asList(CommunicationMethod1Choice.mmObject(), CommunicationChannel1.mmObject(), PresentationMedium1Choice.mmObject(), Channel1Choice.mmObject(), Presentation3.mmObject(),
						Presentation4.mmObject(), Presentation2.mmObject(), Presentation1.mmObject(), RegisteredContractCommunication1.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}