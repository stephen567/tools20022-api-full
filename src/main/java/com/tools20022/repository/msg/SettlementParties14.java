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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV02;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03;
import com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification48;
import com.tools20022.repository.msg.PartyIdentificationAndAccount45;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Chain of parties involved in the settlement of a transaction, including
 * receipts and deliveries, book transfers, treasury deals, or other activities,
 * resulting in the movement of a security or amount of money from one account
 * to another.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementParties14#mmDepository
 * SettlementParties14.mmDepository}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties14#mmParty1
 * SettlementParties14.mmParty1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties14#mmParty2
 * SettlementParties14.mmParty2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties14#mmParty3
 * SettlementParties14.mmParty3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties14#mmParty4
 * SettlementParties14.mmParty4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SettlementParties14#mmParty5
 * SettlementParties14.mmParty5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
 * SecuritiesSettlementPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV02#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionReversalAdviceV02.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV02#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionReversalAdviceV02.mmReceivingSettlementParties
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionReversalAdviceV03.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV03#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionReversalAdviceV03.mmReceivingSettlementParties
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionReversalAdviceV04.
 * mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdviceV04#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionReversalAdviceV04.mmReceivingSettlementParties
 * }</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementParties14"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintParty2PresenceRule#forSettlementParties14
 * ConstraintParty2PresenceRule.forSettlementParties14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintParty3PresenceRule#forSettlementParties14
 * ConstraintParty3PresenceRule.forSettlementParties14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintParty4PresenceRule#forSettlementParties14
 * ConstraintParty4PresenceRule.forSettlementParties14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintParty5PresenceRule#forSettlementParties14
 * ConstraintParty5PresenceRule.forSettlementParties14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementChainGuideline#forSettlementParties14
 * ConstraintSettlementChainGuideline.forSettlementParties14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDepositoryGuideline#forSettlementParties14
 * ConstraintDepositoryGuideline.forSettlementParties14}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintBookTransferGuideline#forSettlementParties14
 * ConstraintBookTransferGuideline.forSettlementParties14}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementParties14", propOrder = {"depository", "party1", "party2", "party3", "party4", "party5"})
public class SettlementParties14 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Dpstry")
	protected PartyIdentification48 depository;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyIdentification48
	 * PartyIdentification48}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties14
	 * SettlementParties14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Dpstry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Depository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "First party in the settlement chain. In a plain vanilla settlement, it is the Central Securities Depository where the counterparty requests to receive the financial instrument or from where the counterparty delivers the financial instruments."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::PSET</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties14, Optional<PartyIdentification48>> mmDepository = new MMMessageAssociationEnd<SettlementParties14, Optional<PartyIdentification48>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties14.mmObject();
			isDerived = false;
			xmlTag = "Dpstry";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::PSET"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Depository";
			definition = "First party in the settlement chain. In a plain vanilla settlement, it is the Central Securities Depository where the counterparty requests to receive the financial instrument or from where the counterparty delivers the financial instruments.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification48.mmObject();
		}

		@Override
		public Optional<PartyIdentification48> getValue(SettlementParties14 obj) {
			return obj.getDepository();
		}

		@Override
		public void setValue(SettlementParties14 obj, Optional<PartyIdentification48> value) {
			obj.setDepository(value.orElse(null));
		}
	};
	@XmlElement(name = "Pty1")
	protected PartyIdentificationAndAccount45 party1;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount45
	 * PartyIdentificationAndAccount45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties14
	 * SettlementParties14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that, in a settlement chain interacts with the depository."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::REAG or DEAG</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties14, Optional<PartyIdentificationAndAccount45>> mmParty1 = new MMMessageAssociationEnd<SettlementParties14, Optional<PartyIdentificationAndAccount45>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties14.mmObject();
			isDerived = false;
			xmlTag = "Pty1";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::REAG or DEAG"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party1";
			definition = "Party that, in a settlement chain interacts with the depository.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount45.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount45> getValue(SettlementParties14 obj) {
			return obj.getParty1();
		}

		@Override
		public void setValue(SettlementParties14 obj, Optional<PartyIdentificationAndAccount45> value) {
			obj.setParty1(value.orElse(null));
		}
	};
	@XmlElement(name = "Pty2")
	protected PartyIdentificationAndAccount45 party2;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount45
	 * PartyIdentificationAndAccount45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties14
	 * SettlementParties14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that, in a settlement chain interacts with the party 1."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::REI2 or DEI2, ISO15022Synonym:
	 * :95a::REI1 or DEI1, ISO15022Synonym: :95a::RECU or DECU, ISO15022Synonym:
	 * :95a::BUYR or SELL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties14, Optional<PartyIdentificationAndAccount45>> mmParty2 = new MMMessageAssociationEnd<SettlementParties14, Optional<PartyIdentificationAndAccount45>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties14.mmObject();
			isDerived = false;
			xmlTag = "Pty2";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::REI2 or DEI2"), new ISO15022Synonym(this, ":95a::REI1 or DEI1"), new ISO15022Synonym(this, ":95a::RECU or DECU"), new ISO15022Synonym(this,
					":95a::BUYR or SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party2";
			definition = "Party that, in a settlement chain interacts with the party 1.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount45.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount45> getValue(SettlementParties14 obj) {
			return obj.getParty2();
		}

		@Override
		public void setValue(SettlementParties14 obj, Optional<PartyIdentificationAndAccount45> value) {
			obj.setParty2(value.orElse(null));
		}
	};
	@XmlElement(name = "Pty3")
	protected PartyIdentificationAndAccount45 party3;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount45
	 * PartyIdentificationAndAccount45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties14
	 * SettlementParties14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty3"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that, in a settlement chain interacts with the party 2."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::REI1 or DEI1, ISO15022Synonym:
	 * :95a::RECU or DECU, ISO15022Synonym: :95a::BUYR or SELL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties14, Optional<PartyIdentificationAndAccount45>> mmParty3 = new MMMessageAssociationEnd<SettlementParties14, Optional<PartyIdentificationAndAccount45>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties14.mmObject();
			isDerived = false;
			xmlTag = "Pty3";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::REI1 or DEI1"), new ISO15022Synonym(this, ":95a::RECU or DECU"), new ISO15022Synonym(this, ":95a::BUYR or SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party3";
			definition = "Party that, in a settlement chain interacts with the party 2.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount45.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount45> getValue(SettlementParties14 obj) {
			return obj.getParty3();
		}

		@Override
		public void setValue(SettlementParties14 obj, Optional<PartyIdentificationAndAccount45> value) {
			obj.setParty3(value.orElse(null));
		}
	};
	@XmlElement(name = "Pty4")
	protected PartyIdentificationAndAccount45 party4;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount45
	 * PartyIdentificationAndAccount45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties14
	 * SettlementParties14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty4"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that, in a settlement chain interacts with the party 3."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::RECU or DECU, ISO15022Synonym:
	 * :95a::BUYR or SELL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties14, Optional<PartyIdentificationAndAccount45>> mmParty4 = new MMMessageAssociationEnd<SettlementParties14, Optional<PartyIdentificationAndAccount45>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties14.mmObject();
			isDerived = false;
			xmlTag = "Pty4";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::RECU or DECU"), new ISO15022Synonym(this, ":95a::BUYR or SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party4";
			definition = "Party that, in a settlement chain interacts with the party 3.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount45.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount45> getValue(SettlementParties14 obj) {
			return obj.getParty4();
		}

		@Override
		public void setValue(SettlementParties14 obj, Optional<PartyIdentificationAndAccount45> value) {
			obj.setParty4(value.orElse(null));
		}
	};
	@XmlElement(name = "Pty5")
	protected PartyIdentificationAndAccount45 party5;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount45
	 * PartyIdentificationAndAccount45}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementParties14
	 * SettlementParties14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pty5"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Party5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that, in a settlement chain interacts with the party 4."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :95a::BUYR or SELL</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementParties14, Optional<PartyIdentificationAndAccount45>> mmParty5 = new MMMessageAssociationEnd<SettlementParties14, Optional<PartyIdentificationAndAccount45>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementParties14.mmObject();
			isDerived = false;
			xmlTag = "Pty5";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":95a::BUYR or SELL"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Party5";
			definition = "Party that, in a settlement chain interacts with the party 4.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount45.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount45> getValue(SettlementParties14 obj) {
			return obj.getParty5();
		}

		@Override
		public void setValue(SettlementParties14 obj, Optional<PartyIdentificationAndAccount45> value) {
			obj.setParty5(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementParties14.mmDepository, com.tools20022.repository.msg.SettlementParties14.mmParty1,
						com.tools20022.repository.msg.SettlementParties14.mmParty2, com.tools20022.repository.msg.SettlementParties14.mmParty3, com.tools20022.repository.msg.SettlementParties14.mmParty4,
						com.tools20022.repository.msg.SettlementParties14.mmParty5);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionReversalAdviceV02.mmDeliveringSettlementParties, SecuritiesSettlementTransactionReversalAdviceV02.mmReceivingSettlementParties,
						SecuritiesSettlementTransactionReversalAdviceV03.mmDeliveringSettlementParties, SecuritiesSettlementTransactionReversalAdviceV03.mmReceivingSettlementParties,
						SecuritiesSettlementTransactionReversalAdviceV04.mmDeliveringSettlementParties, SecuritiesSettlementTransactionReversalAdviceV04.mmReceivingSettlementParties);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintParty2PresenceRule.forSettlementParties14, com.tools20022.repository.constraints.ConstraintParty3PresenceRule.forSettlementParties14,
						com.tools20022.repository.constraints.ConstraintParty4PresenceRule.forSettlementParties14, com.tools20022.repository.constraints.ConstraintParty5PresenceRule.forSettlementParties14,
						com.tools20022.repository.constraints.ConstraintSettlementChainGuideline.forSettlementParties14, com.tools20022.repository.constraints.ConstraintDepositoryGuideline.forSettlementParties14,
						com.tools20022.repository.constraints.ConstraintBookTransferGuideline.forSettlementParties14);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SettlementParties14";
				definition = "Chain of parties involved in the settlement of a transaction, including receipts and deliveries, book transfers, treasury deals, or other activities, resulting in the movement of a security or amount of money from one account to another.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentification48> getDepository() {
		return depository == null ? Optional.empty() : Optional.of(depository);
	}

	public SettlementParties14 setDepository(PartyIdentification48 depository) {
		this.depository = depository;
		return this;
	}

	public Optional<PartyIdentificationAndAccount45> getParty1() {
		return party1 == null ? Optional.empty() : Optional.of(party1);
	}

	public SettlementParties14 setParty1(PartyIdentificationAndAccount45 party1) {
		this.party1 = party1;
		return this;
	}

	public Optional<PartyIdentificationAndAccount45> getParty2() {
		return party2 == null ? Optional.empty() : Optional.of(party2);
	}

	public SettlementParties14 setParty2(PartyIdentificationAndAccount45 party2) {
		this.party2 = party2;
		return this;
	}

	public Optional<PartyIdentificationAndAccount45> getParty3() {
		return party3 == null ? Optional.empty() : Optional.of(party3);
	}

	public SettlementParties14 setParty3(PartyIdentificationAndAccount45 party3) {
		this.party3 = party3;
		return this;
	}

	public Optional<PartyIdentificationAndAccount45> getParty4() {
		return party4 == null ? Optional.empty() : Optional.of(party4);
	}

	public SettlementParties14 setParty4(PartyIdentificationAndAccount45 party4) {
		this.party4 = party4;
		return this;
	}

	public Optional<PartyIdentificationAndAccount45> getParty5() {
		return party5 == null ? Optional.empty() : Optional.of(party5);
	}

	public SettlementParties14 setParty5(PartyIdentificationAndAccount45 party5) {
		this.party5 = party5;
		return this;
	}
}