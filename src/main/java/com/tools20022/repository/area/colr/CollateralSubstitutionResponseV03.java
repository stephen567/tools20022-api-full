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

package com.tools20022.repository.area.colr;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CollateralManagementPreviousVersion;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.msg.Agreement2;
import com.tools20022.repository.msg.Obligation3;
import com.tools20022.repository.msg.SubstitutionResponse1;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.CollateralManagementISOPreviousversion;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by either the collateral taker or its collateral manager
 * to the collateral giver or its collateral manager. This is a response to the
 * CollateralSubstitutionRequest message and the collateral proposed in the
 * substitution request can be accepted or rejected. If the collateral proposed
 * is rejected then a new CollateralSubstitutionRequest should be sent. Note:
 * There are cases where the collateral giver will send this message when the
 * collateral taker has initiated the CollateralSubstitutionRequest message, for
 * example in case of breach in the concentration limit.<br>
 * <br>
 * The message definition is intended for use with the ISO20022 Business
 * Application Header.<br>
 * <br>
 * <b>Usage</b><br>
 * This is a response to the CollateralSubstitutionRequest message and the
 * collateral proposed in the substitution request can be accepted or rejected.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code colr.011.001.03}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CollateralManagementPreviousVersion
 * CollateralManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV03#mmTransactionIdentification
 * CollateralSubstitutionResponseV03.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV03#mmObligation
 * CollateralSubstitutionResponseV03.mmObligation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV03#mmAgreement
 * CollateralSubstitutionResponseV03.mmAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV03#mmSubstitutionResponse
 * CollateralSubstitutionResponseV03.mmSubstitutionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV03#mmSupplementaryData
 * CollateralSubstitutionResponseV03.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.CollateralManagementISOPreviousversion
 * CollateralManagementISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CollSbstitnRspn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralSubstitutionResponseV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by either the collateral taker or its collateral manager to the collateral giver or its collateral manager. This is a response to the CollateralSubstitutionRequest message and the collateral proposed in the substitution request can be accepted or rejected. If the collateral proposed is rejected then a new CollateralSubstitutionRequest should be sent. Note: There are cases where the collateral giver will send this message when the collateral taker has initiated the CollateralSubstitutionRequest message, for example in case of breach in the concentration limit.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThis is a response to the CollateralSubstitutionRequest message and the collateral proposed in the substitution request can be accepted or rejected."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV04
 * CollateralSubstitutionResponseV04}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralSubstitutionResponseV03", propOrder = {"transactionIdentification", "obligation", "agreement", "substitutionResponse", "supplementaryData"})
public class CollateralSubstitutionResponseV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected Max35Text transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as know by the instructing party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV04#mmTransactionIdentification
	 * CollateralSubstitutionResponseV04.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CollateralSubstitutionResponseV03, Max35Text> mmTransactionIdentification = new MMMessageBuildingBlock<CollateralSubstitutionResponseV03, Max35Text>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as know by the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitutionResponseV04.mmTransactionIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CollateralSubstitutionResponseV03 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(CollateralSubstitutionResponseV03 obj, Max35Text value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "Oblgtn", required = true)
	protected Obligation3 obligation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Obligation3
	 * Obligation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Oblgtn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Obligation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV04#mmObligation
	 * CollateralSubstitutionResponseV04.mmObligation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CollateralSubstitutionResponseV03, Obligation3> mmObligation = new MMMessageBuildingBlock<CollateralSubstitutionResponseV03, Obligation3>() {
		{
			xmlTag = "Oblgtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Obligation";
			definition = "Provides information like the identification of the party or parties associated with the collateral agreement, the exposure type and the valuation date.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitutionResponseV04.mmObligation);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Obligation3.mmObject();
		}

		@Override
		public Obligation3 getValue(CollateralSubstitutionResponseV03 obj) {
			return obj.getObligation();
		}

		@Override
		public void setValue(CollateralSubstitutionResponseV03 obj, Obligation3 value) {
			obj.setObligation(value);
		}
	};
	@XmlElement(name = "Agrmt")
	protected Agreement2 agreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Agreement2
	 * Agreement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Agrmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Agreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement details for the over the counter market."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV04#mmAgreement
	 * CollateralSubstitutionResponseV04.mmAgreement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CollateralSubstitutionResponseV03, Optional<Agreement2>> mmAgreement = new MMMessageBuildingBlock<CollateralSubstitutionResponseV03, Optional<Agreement2>>() {
		{
			xmlTag = "Agrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Agreement";
			definition = "Agreement details for the over the counter market.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitutionResponseV04.mmAgreement);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Agreement2.mmObject();
		}

		@Override
		public Optional<Agreement2> getValue(CollateralSubstitutionResponseV03 obj) {
			return obj.getAgreement();
		}

		@Override
		public void setValue(CollateralSubstitutionResponseV03 obj, Optional<Agreement2> value) {
			obj.setAgreement(value.orElse(null));
		}
	};
	@XmlElement(name = "SbstitnRspn", required = true)
	protected SubstitutionResponse1 substitutionResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SubstitutionResponse1
	 * SubstitutionResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbstitnRspn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the collateral substitution response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV04#mmSubstitutionResponse
	 * CollateralSubstitutionResponseV04.mmSubstitutionResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CollateralSubstitutionResponseV03, SubstitutionResponse1> mmSubstitutionResponse = new MMMessageBuildingBlock<CollateralSubstitutionResponseV03, SubstitutionResponse1>() {
		{
			xmlTag = "SbstitnRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstitutionResponse";
			definition = "Provides details about the collateral substitution response.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitutionResponseV04.mmSubstitutionResponse);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SubstitutionResponse1.mmObject();
		}

		@Override
		public SubstitutionResponse1 getValue(CollateralSubstitutionResponseV03 obj) {
			return obj.getSubstitutionResponse();
		}

		@Override
		public void setValue(CollateralSubstitutionResponseV03 obj, SubstitutionResponse1 value) {
			obj.setSubstitutionResponse(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV04#mmSupplementaryData
	 * CollateralSubstitutionResponseV04.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CollateralSubstitutionResponseV03, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CollateralSubstitutionResponseV03, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(CollateralSubstitutionResponseV04.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CollateralSubstitutionResponseV03 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CollateralSubstitutionResponseV03 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralSubstitutionResponseV03";
				definition = "Scope\r\nThis message is sent by either the collateral taker or its collateral manager to the collateral giver or its collateral manager. This is a response to the CollateralSubstitutionRequest message and the collateral proposed in the substitution request can be accepted or rejected. If the collateral proposed is rejected then a new CollateralSubstitutionRequest should be sent. Note: There are cases where the collateral giver will send this message when the collateral taker has initiated the CollateralSubstitutionRequest message, for example in case of breach in the concentration limit.\r\n\r\nThe message definition is intended for use with the ISO20022 Business Application Header.\r\n\r\nUsage\r\nThis is a response to the CollateralSubstitutionRequest message and the collateral proposed in the substitution request can be accepted or rejected.";
				nextVersions_lazy = () -> Arrays.asList(CollateralSubstitutionResponseV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject(), CollateralManagementISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "CollSbstitnRspn";
				businessArea_lazy = () -> CollateralManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.colr.CollateralSubstitutionResponseV03.mmTransactionIdentification,
						com.tools20022.repository.area.colr.CollateralSubstitutionResponseV03.mmObligation, com.tools20022.repository.area.colr.CollateralSubstitutionResponseV03.mmAgreement,
						com.tools20022.repository.area.colr.CollateralSubstitutionResponseV03.mmSubstitutionResponse, com.tools20022.repository.area.colr.CollateralSubstitutionResponseV03.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "colr";
						messageFunctionality = "011";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CollateralSubstitutionResponseV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransactionIdentification() {
		return transactionIdentification;
	}

	public CollateralSubstitutionResponseV03 setTransactionIdentification(Max35Text transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Obligation3 getObligation() {
		return obligation;
	}

	public CollateralSubstitutionResponseV03 setObligation(Obligation3 obligation) {
		this.obligation = Objects.requireNonNull(obligation);
		return this;
	}

	public Optional<Agreement2> getAgreement() {
		return agreement == null ? Optional.empty() : Optional.of(agreement);
	}

	public CollateralSubstitutionResponseV03 setAgreement(Agreement2 agreement) {
		this.agreement = agreement;
		return this;
	}

	public SubstitutionResponse1 getSubstitutionResponse() {
		return substitutionResponse;
	}

	public CollateralSubstitutionResponseV03 setSubstitutionResponse(SubstitutionResponse1 substitutionResponse) {
		this.substitutionResponse = Objects.requireNonNull(substitutionResponse);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CollateralSubstitutionResponseV03 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.011.001.03")
	static public class Document {
		@XmlElement(name = "CollSbstitnRspn", required = true)
		public CollateralSubstitutionResponseV03 messageBody;
	}
}