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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.*;
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
 * Specifies individually each leg of a transport of goods.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport1#mmTransportByAir
 * SingleTransport1.mmTransportByAir}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport1#mmTransportBySea
 * SingleTransport1.mmTransportBySea}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport1#mmTransportByRoad
 * SingleTransport1.mmTransportByRoad}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SingleTransport1#mmTransportByRail
 * SingleTransport1.mmTransportByRail}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Transport Transport}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SingleTransport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies individually each leg of a transport of goods."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SingleTransport1", propOrder = {"transportByAir", "transportBySea", "transportByRoad", "transportByRail"})
public class SingleTransport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrnsprtByAir")
	protected List<com.tools20022.repository.msg.TransportByAir1> transportByAir;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportByAir1
	 * TransportByAir1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportByAir
	 * TransportByAir}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport1
	 * SingleTransport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtByAir"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportByAir"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Moving of goods or people from one place to another by vehicle."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportByAir = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TransportByAir.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleTransport1.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtByAir";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportByAir";
			definition = "Moving of goods or people from one place to another by vehicle.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransportByAir1.mmObject();
		}
	};
	@XmlElement(name = "TrnsprtBySea")
	protected List<com.tools20022.repository.msg.TransportBySea1> transportBySea;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportBySea1
	 * TransportBySea1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportBySea
	 * TransportBySea}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport1
	 * SingleTransport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtBySea"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportBySea"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related for the transportation of goods by sea."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportBySea = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TransportBySea.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleTransport1.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtBySea";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportBySea";
			definition = "Information related for the transportation of goods by sea.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransportBySea1.mmObject();
		}
	};
	@XmlElement(name = "TrnsprtByRoad")
	protected List<com.tools20022.repository.msg.TransportByRoad1> transportByRoad;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportByRoad1
	 * TransportByRoad1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportByRoad
	 * TransportByRoad}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport1
	 * SingleTransport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtByRoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportByRoad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the transportation of goods by road."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportByRoad = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TransportByRoad.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleTransport1.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtByRoad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportByRoad";
			definition = "Information related to the transportation of goods by road.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransportByRoad1.mmObject();
		}
	};
	@XmlElement(name = "TrnsprtByRail")
	protected List<com.tools20022.repository.msg.TransportByRail1> transportByRail;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransportByRail1
	 * TransportByRail1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TransportByRail
	 * TransportByRail}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SingleTransport1
	 * SingleTransport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrnsprtByRail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransportByRail"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the transportation of goods by rail."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransportByRail = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TransportByRail.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SingleTransport1.mmObject();
			isDerived = false;
			xmlTag = "TrnsprtByRail";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransportByRail";
			definition = "Information related to the transportation of goods by rail.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransportByRail1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SingleTransport1.mmTransportByAir, com.tools20022.repository.msg.SingleTransport1.mmTransportBySea,
						com.tools20022.repository.msg.SingleTransport1.mmTransportByRoad, com.tools20022.repository.msg.SingleTransport1.mmTransportByRail);
				trace_lazy = () -> Transport.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SingleTransport1";
				definition = "Specifies individually each leg of a transport of goods.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<TransportByAir1> getTransportByAir() {
		return transportByAir == null ? transportByAir = new ArrayList<>() : transportByAir;
	}

	public SingleTransport1 setTransportByAir(List<com.tools20022.repository.msg.TransportByAir1> transportByAir) {
		this.transportByAir = Objects.requireNonNull(transportByAir);
		return this;
	}

	public List<TransportBySea1> getTransportBySea() {
		return transportBySea == null ? transportBySea = new ArrayList<>() : transportBySea;
	}

	public SingleTransport1 setTransportBySea(List<com.tools20022.repository.msg.TransportBySea1> transportBySea) {
		this.transportBySea = Objects.requireNonNull(transportBySea);
		return this;
	}

	public List<TransportByRoad1> getTransportByRoad() {
		return transportByRoad == null ? transportByRoad = new ArrayList<>() : transportByRoad;
	}

	public SingleTransport1 setTransportByRoad(List<com.tools20022.repository.msg.TransportByRoad1> transportByRoad) {
		this.transportByRoad = Objects.requireNonNull(transportByRoad);
		return this;
	}

	public List<TransportByRail1> getTransportByRail() {
		return transportByRail == null ? transportByRail = new ArrayList<>() : transportByRail;
	}

	public SingleTransport1 setTransportByRail(List<com.tools20022.repository.msg.TransportByRail1> transportByRail) {
		this.transportByRail = Objects.requireNonNull(transportByRail);
		return this;
	}
}