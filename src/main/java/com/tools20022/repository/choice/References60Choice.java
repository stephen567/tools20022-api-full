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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequest002V05;
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.entity.SecuritiesTradeExecution;
import com.tools20022.repository.entity.SecuritiesTradeIdentification;
import com.tools20022.repository.entity.TradeIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.GenericDocumentIdentification6;
import com.tools20022.repository.msg.SettlementTypeAndIdentification22;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of reference.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References60Choice#mmSecuritiesSettlementTransactionIdentification
 * References60Choice.mmSecuritiesSettlementTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References60Choice#mmSecuritiesFinancingTransactionIdentification
 * References60Choice.mmSecuritiesFinancingTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References60Choice#mmIntraPositionMovementIdentification
 * References60Choice.mmIntraPositionMovementIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.References60Choice#mmOtherTransactionIdentification
 * References60Choice.mmOtherTransactionIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification
 * SecuritiesTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequest002V05#mmAccountOwnerTransactionIdentification
 * SecuritiesTransactionCancellationRequest002V05.
 * mmAccountOwnerTransactionIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "References60Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of reference."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "References60Choice", propOrder = {"securitiesSettlementTransactionIdentification", "securitiesFinancingTransactionIdentification", "intraPositionMovementIdentification", "otherTransactionIdentification"})
public class References60Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctiesSttlmTxId", required = true)
	protected SettlementTypeAndIdentification22 securitiesSettlementTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification22
	 * SettlementTypeAndIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References60Choice
	 * References60Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesSttlmTxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesSettlementTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the securities settlement transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::PREV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References60Choice, SettlementTypeAndIdentification22> mmSecuritiesSettlementTransactionIdentification = new MMMessageAssociationEnd<References60Choice, SettlementTypeAndIdentification22>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.References60Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesSttlmTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::PREV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesSettlementTransactionIdentification";
			definition = "Unambiguous identification of the securities settlement transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementTypeAndIdentification22.mmObject();
		}

		@Override
		public SettlementTypeAndIdentification22 getValue(References60Choice obj) {
			return obj.getSecuritiesSettlementTransactionIdentification();
		}

		@Override
		public void setValue(References60Choice obj, SettlementTypeAndIdentification22 value) {
			obj.setSecuritiesSettlementTransactionIdentification(value);
		}
	};
	@XmlElement(name = "SctiesFincgTxId", required = true)
	protected SettlementTypeAndIdentification22 securitiesFinancingTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndIdentification22
	 * SettlementTypeAndIdentification22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References60Choice
	 * References60Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesFincgTxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFinancingTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the underlying securities financing transaction (not the underlying securities financing trade) as assigned by the instructing party."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::REPO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References60Choice, SettlementTypeAndIdentification22> mmSecuritiesFinancingTransactionIdentification = new MMMessageAssociationEnd<References60Choice, SettlementTypeAndIdentification22>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.choice.References60Choice.mmObject();
			isDerived = false;
			xmlTag = "SctiesFincgTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::REPO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFinancingTransactionIdentification";
			definition = "Unambiguous identification of the underlying securities financing transaction (not the underlying securities financing trade) as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SettlementTypeAndIdentification22.mmObject();
		}

		@Override
		public SettlementTypeAndIdentification22 getValue(References60Choice obj) {
			return obj.getSecuritiesFinancingTransactionIdentification();
		}

		@Override
		public void setValue(References60Choice obj, SettlementTypeAndIdentification22 value) {
			obj.setSecuritiesFinancingTransactionIdentification(value);
		}
	};
	@XmlElement(name = "IntraPosMvmntId", required = true)
	protected RestrictedFINXMax16Text intraPositionMovementIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References60Choice
	 * References60Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntraPosMvmntId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntraPositionMovementIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the intra-position movement transaction requested to be cancelled as known by the account owner (or instructing party acting on its behalf)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C::PREV</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<References60Choice, RestrictedFINXMax16Text> mmIntraPositionMovementIdentification = new MMMessageAttribute<References60Choice, RestrictedFINXMax16Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.References60Choice.mmObject();
			isDerived = false;
			xmlTag = "IntraPosMvmntId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C::PREV"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntraPositionMovementIdentification";
			definition = "Reference to the intra-position movement transaction requested to be cancelled as known by the account owner (or instructing party acting on its behalf).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}

		@Override
		public RestrictedFINXMax16Text getValue(References60Choice obj) {
			return obj.getIntraPositionMovementIdentification();
		}

		@Override
		public void setValue(References60Choice obj, RestrictedFINXMax16Text value) {
			obj.setIntraPositionMovementIdentification(value);
		}
	};
	@XmlElement(name = "OthrTxId", required = true)
	protected GenericDocumentIdentification6 otherTransactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericDocumentIdentification6
	 * GenericDocumentIdentification6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.References60Choice
	 * References60Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrTxId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a transaction that cannot be identified using a standard reference element present in the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :20C:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<References60Choice, GenericDocumentIdentification6> mmOtherTransactionIdentification = new MMMessageAssociationEnd<References60Choice, GenericDocumentIdentification6>() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.References60Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrTxId";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":20C:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherTransactionIdentification";
			definition = "Reference to a transaction that cannot be identified using a standard reference element present in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> GenericDocumentIdentification6.mmObject();
		}

		@Override
		public GenericDocumentIdentification6 getValue(References60Choice obj) {
			return obj.getOtherTransactionIdentification();
		}

		@Override
		public void setValue(References60Choice obj, GenericDocumentIdentification6 value) {
			obj.setOtherTransactionIdentification(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.References60Choice.mmSecuritiesSettlementTransactionIdentification,
						com.tools20022.repository.choice.References60Choice.mmSecuritiesFinancingTransactionIdentification, com.tools20022.repository.choice.References60Choice.mmIntraPositionMovementIdentification,
						com.tools20022.repository.choice.References60Choice.mmOtherTransactionIdentification);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTransactionCancellationRequest002V05.mmAccountOwnerTransactionIdentification);
				trace_lazy = () -> SecuritiesTradeIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "References60Choice";
				definition = "Choice of reference.";
			}
		});
		return mmObject_lazy.get();
	}

	public SettlementTypeAndIdentification22 getSecuritiesSettlementTransactionIdentification() {
		return securitiesSettlementTransactionIdentification;
	}

	public References60Choice setSecuritiesSettlementTransactionIdentification(SettlementTypeAndIdentification22 securitiesSettlementTransactionIdentification) {
		this.securitiesSettlementTransactionIdentification = Objects.requireNonNull(securitiesSettlementTransactionIdentification);
		return this;
	}

	public SettlementTypeAndIdentification22 getSecuritiesFinancingTransactionIdentification() {
		return securitiesFinancingTransactionIdentification;
	}

	public References60Choice setSecuritiesFinancingTransactionIdentification(SettlementTypeAndIdentification22 securitiesFinancingTransactionIdentification) {
		this.securitiesFinancingTransactionIdentification = Objects.requireNonNull(securitiesFinancingTransactionIdentification);
		return this;
	}

	public RestrictedFINXMax16Text getIntraPositionMovementIdentification() {
		return intraPositionMovementIdentification;
	}

	public References60Choice setIntraPositionMovementIdentification(RestrictedFINXMax16Text intraPositionMovementIdentification) {
		this.intraPositionMovementIdentification = Objects.requireNonNull(intraPositionMovementIdentification);
		return this;
	}

	public GenericDocumentIdentification6 getOtherTransactionIdentification() {
		return otherTransactionIdentification;
	}

	public References60Choice setOtherTransactionIdentification(GenericDocumentIdentification6 otherTransactionIdentification) {
		this.otherTransactionIdentification = Objects.requireNonNull(otherTransactionIdentification);
		return this;
	}
}