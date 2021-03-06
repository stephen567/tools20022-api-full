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
import com.tools20022.repository.area.seev.CorporateActionNarrative002V04;
import com.tools20022.repository.area.seev.IntraPositionMovementConfirmation002V06;
import com.tools20022.repository.area.semt.IntraPositionMovementConfirmation002V05;
import com.tools20022.repository.area.semt.IntraPositionMovementConfirmation002V07;
import com.tools20022.repository.area.semt.IntraPositionMovementInstruction002V04;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.datatype.ISINOct2015Identifier;
import com.tools20022.repository.datatype.RestrictedFINXMax140Text;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OtherIdentification2;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20#mmISIN
 * SecurityIdentification20.mmISIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20#mmOtherIdentification
 * SecurityIdentification20.mmOtherIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20#mmDescription
 * SecurityIdentification20.mmDescription}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
 * SecuritiesIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrative002V04#mmUnderlyingSecurity
 * CorporateActionNarrative002V04.mmUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V05#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionAllegementNotification002V05.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V05#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionReversalAdvice002V05.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V06#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionConfirmation002V06.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstruction002V05#mmFinancialInstrumentIdentification
 * SecuritiesFinancingModificationInstruction002V05.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementInstruction002V04#mmFinancialInstrumentIdentification
 * IntraPositionMovementInstruction002V04.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V06#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionGenerationNotification002V06.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V06#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionInstruction002V06.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V06#mmFinancialInstrumentIdentification
 * SecuritiesFinancingInstruction002V06.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V06#mmFinancialInstrumentIdentification
 * SecuritiesFinancingConfirmation002V06.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmation002V05#mmFinancialInstrumentIdentification
 * IntraPositionMovementConfirmation002V05.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.IntraPositionMovementConfirmation002V06#mmFinancialInstrumentIdentification
 * IntraPositionMovementConfirmation002V06.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V06#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionAllegementNotification002V06.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V07#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionInstruction002V07.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V07#mmFinancialInstrumentIdentification
 * SecuritiesFinancingConfirmation002V07.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V07#mmFinancialInstrumentIdentification
 * SecuritiesFinancingInstruction002V07.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V07#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionGenerationNotification002V07.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingModificationInstruction002V06#mmFinancialInstrumentIdentification
 * SecuritiesFinancingModificationInstruction002V06.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V07#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionConfirmation002V07.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V06#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionReversalAdvice002V06.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.IntraPositionMovementConfirmation002V07#mmFinancialInstrumentIdentification
 * IntraPositionMovementConfirmation002V07.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingConfirmation002V08#mmFinancialInstrumentIdentification
 * SecuritiesFinancingConfirmation002V08.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingInstruction002V08#mmFinancialInstrumentIdentification
 * SecuritiesFinancingInstruction002V08.mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionAllegementNotification002V07#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionAllegementNotification002V07.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionConfirmation002V08#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionConfirmation002V08.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionGenerationNotification002V08#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionGenerationNotification002V08.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionInstruction002V08#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionInstruction002V08.
 * mmFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionReversalAdvice002V07#mmFinancialInstrumentIdentification
 * SecuritiesSettlementTransactionReversalAdvice002V07.
 * mmFinancialInstrumentIdentification}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecurityIdentification20"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a security."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDescriptionPresenceRule#forSecurityIdentification20
 * ConstraintDescriptionPresenceRule.forSecurityIdentification20}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOtherIdentificationPresenceRule#forSecurityIdentification20
 * ConstraintOtherIdentificationPresenceRule.forSecurityIdentification20}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintISINPresenceRule#forSecurityIdentification20
 * ConstraintISINPresenceRule.forSecurityIdentification20}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDescriptionUsageRule#forSecurityIdentification20
 * ConstraintDescriptionUsageRule.forSecurityIdentification20}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintISINGuideline#forSecurityIdentification20
 * ConstraintISINGuideline.forSecurityIdentification20}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityIdentification20", propOrder = {"iSIN", "otherIdentification", "description"})
public class SecurityIdentification20 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ISIN")
	protected ISINOct2015Identifier iSIN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ISINOct2015Identifier
	 * ISINOct2015Identifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification#mmSecurityIdentification
	 * SecuritiesIdentification.mmSecurityIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20
	 * SecurityIdentification20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Securities Identification Number (ISIN). A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityIdentification20, Optional<ISINOct2015Identifier>> mmISIN = new MMMessageAttribute<SecurityIdentification20, Optional<ISINOct2015Identifier>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityIdentification20.mmObject();
			isDerived = false;
			xmlTag = "ISIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISIN";
			definition = "International Securities Identification Number (ISIN). A numbering system designed by the United Nation's International Organisation for Standardisation (ISO). The ISIN is composed of a 2-character prefix representing the country of issue, followed by the national security number (if one exists), and a check digit. Each country has a national numbering agency that assigns ISIN numbers for securities in that country.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}

		@Override
		public Optional<ISINOct2015Identifier> getValue(SecurityIdentification20 obj) {
			return obj.getISIN();
		}

		@Override
		public void setValue(SecurityIdentification20 obj, Optional<ISINOct2015Identifier> value) {
			obj.setISIN(value.orElse(null));
		}
	};
	@XmlElement(name = "OthrId")
	protected List<OtherIdentification2> otherIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherIdentification2
	 * OtherIdentification2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20
	 * SecurityIdentification20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a security by proprietary or domestic identification scheme."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityIdentification20, List<OtherIdentification2>> mmOtherIdentification = new MMMessageAssociationEnd<SecurityIdentification20, List<OtherIdentification2>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityIdentification20.mmObject();
			isDerived = false;
			xmlTag = "OthrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherIdentification";
			definition = "Identification of a security by proprietary or domestic identification scheme.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherIdentification2.mmObject();
		}

		@Override
		public List<OtherIdentification2> getValue(SecurityIdentification20 obj) {
			return obj.getOtherIdentification();
		}

		@Override
		public void setValue(SecurityIdentification20 obj, List<OtherIdentification2> value) {
			obj.setOtherIdentification(value);
		}
	};
	@XmlElement(name = "Desc")
	protected RestrictedFINXMax140Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax140Text
	 * RestrictedFINXMax140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesIdentification
	 * SecuritiesIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecurityIdentification20
	 * SecurityIdentification20}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Textual description of a security instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SecurityIdentification20, Optional<RestrictedFINXMax140Text>> mmDescription = new MMMessageAttribute<SecurityIdentification20, Optional<RestrictedFINXMax140Text>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesIdentification.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SecurityIdentification20.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Textual description of a security instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax140Text.mmObject();
		}

		@Override
		public Optional<RestrictedFINXMax140Text> getValue(SecurityIdentification20 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(SecurityIdentification20 obj, Optional<RestrictedFINXMax140Text> value) {
			obj.setDescription(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecurityIdentification20.mmISIN, com.tools20022.repository.msg.SecurityIdentification20.mmOtherIdentification,
						com.tools20022.repository.msg.SecurityIdentification20.mmDescription);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionNarrative002V04.mmUnderlyingSecurity, SecuritiesSettlementTransactionAllegementNotification002V05.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionReversalAdvice002V05.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionConfirmation002V06.mmFinancialInstrumentIdentification,
						SecuritiesFinancingModificationInstruction002V05.mmFinancialInstrumentIdentification, IntraPositionMovementInstruction002V04.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionGenerationNotification002V06.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionInstruction002V06.mmFinancialInstrumentIdentification,
						SecuritiesFinancingInstruction002V06.mmFinancialInstrumentIdentification, SecuritiesFinancingConfirmation002V06.mmFinancialInstrumentIdentification,
						IntraPositionMovementConfirmation002V05.mmFinancialInstrumentIdentification, IntraPositionMovementConfirmation002V06.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionAllegementNotification002V06.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionInstruction002V07.mmFinancialInstrumentIdentification,
						SecuritiesFinancingConfirmation002V07.mmFinancialInstrumentIdentification, SecuritiesFinancingInstruction002V07.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionGenerationNotification002V07.mmFinancialInstrumentIdentification, SecuritiesFinancingModificationInstruction002V06.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionConfirmation002V07.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionReversalAdvice002V06.mmFinancialInstrumentIdentification,
						IntraPositionMovementConfirmation002V07.mmFinancialInstrumentIdentification, SecuritiesFinancingConfirmation002V08.mmFinancialInstrumentIdentification,
						SecuritiesFinancingInstruction002V08.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionAllegementNotification002V07.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionConfirmation002V08.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionGenerationNotification002V08.mmFinancialInstrumentIdentification,
						SecuritiesSettlementTransactionInstruction002V08.mmFinancialInstrumentIdentification, SecuritiesSettlementTransactionReversalAdvice002V07.mmFinancialInstrumentIdentification);
				trace_lazy = () -> SecuritiesIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDescriptionPresenceRule.forSecurityIdentification20,
						com.tools20022.repository.constraints.ConstraintOtherIdentificationPresenceRule.forSecurityIdentification20, com.tools20022.repository.constraints.ConstraintISINPresenceRule.forSecurityIdentification20,
						com.tools20022.repository.constraints.ConstraintDescriptionUsageRule.forSecurityIdentification20, com.tools20022.repository.constraints.ConstraintISINGuideline.forSecurityIdentification20);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecurityIdentification20";
				definition = "Identification of a security.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISINOct2015Identifier> getISIN() {
		return iSIN == null ? Optional.empty() : Optional.of(iSIN);
	}

	public SecurityIdentification20 setISIN(ISINOct2015Identifier iSIN) {
		this.iSIN = iSIN;
		return this;
	}

	public List<OtherIdentification2> getOtherIdentification() {
		return otherIdentification == null ? otherIdentification = new ArrayList<>() : otherIdentification;
	}

	public SecurityIdentification20 setOtherIdentification(List<OtherIdentification2> otherIdentification) {
		this.otherIdentification = Objects.requireNonNull(otherIdentification);
		return this;
	}

	public Optional<RestrictedFINXMax140Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public SecurityIdentification20 setDescription(RestrictedFINXMax140Text description) {
		this.description = description;
		return this;
	}
}