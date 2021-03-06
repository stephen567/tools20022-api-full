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
import com.tools20022.repository.area.pain.MandateAcceptanceReportV05;
import com.tools20022.repository.choice.OriginalMandate5Choice;
import com.tools20022.repository.entity.DirectDebitMandate;
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AcceptanceResult6;
import com.tools20022.repository.msg.OriginalMessageInformation1;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the mandate, which is being accepted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5#mmOriginalMessageInformation
 * MandateAcceptance5.mmOriginalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5#mmAcceptanceResult
 * MandateAcceptance5.mmAcceptanceResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5#mmOriginalMandate
 * MandateAcceptance5.mmOriginalMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5#mmSupplementaryData
 * MandateAcceptance5.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.DirectDebitMandate
 * DirectDebitMandate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAcceptanceReportV05#mmUnderlyingAcceptanceDetails
 * MandateAcceptanceReportV05.mmUnderlyingAcceptanceDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MandateAcceptance5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the mandate, which is being accepted."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOriginalMandateIdentificationPresenceRule#forMandateAcceptance5
 * ConstraintOriginalMandateIdentificationPresenceRule.forMandateAcceptance5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.MandateAcceptance4
 * MandateAcceptance4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MandateAcceptance5", propOrder = {"originalMessageInformation", "acceptanceResult", "originalMandate", "supplementaryData"})
public class MandateAcceptance5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlMsgInf")
	protected OriginalMessageInformation1 originalMessageInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalMessageInformation1
	 * OriginalMessageInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5
	 * MandateAcceptance5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information on the original message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance4#mmOriginalMessageInformation
	 * MandateAcceptance4.mmOriginalMessageInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateAcceptance5, Optional<OriginalMessageInformation1>> mmOriginalMessageInformation = new MMMessageAssociationEnd<MandateAcceptance5, Optional<OriginalMessageInformation1>>() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateAcceptance5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageInformation";
			definition = "Provides information on the original message.";
			previousVersion_lazy = () -> MandateAcceptance4.mmOriginalMessageInformation;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalMessageInformation1.mmObject();
		}

		@Override
		public Optional<OriginalMessageInformation1> getValue(MandateAcceptance5 obj) {
			return obj.getOriginalMessageInformation();
		}

		@Override
		public void setValue(MandateAcceptance5 obj, Optional<OriginalMessageInformation1> value) {
			obj.setOriginalMessageInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "AccptncRslt", required = true)
	protected AcceptanceResult6 acceptanceResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AcceptanceResult6
	 * AcceptanceResult6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmMandateStatus
	 * Mandate.mmMandateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5
	 * MandateAcceptance5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AccptncRslt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptanceResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides detailed information on the acceptance result."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance4#mmAcceptanceResult
	 * MandateAcceptance4.mmAcceptanceResult}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateAcceptance5, AcceptanceResult6> mmAcceptanceResult = new MMMessageAssociationEnd<MandateAcceptance5, AcceptanceResult6>() {
		{
			businessElementTrace_lazy = () -> Mandate.mmMandateStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateAcceptance5.mmObject();
			isDerived = false;
			xmlTag = "AccptncRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptanceResult";
			definition = "Provides detailed information on the acceptance result.";
			previousVersion_lazy = () -> MandateAcceptance4.mmAcceptanceResult;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AcceptanceResult6.mmObject();
		}

		@Override
		public AcceptanceResult6 getValue(MandateAcceptance5 obj) {
			return obj.getAcceptanceResult();
		}

		@Override
		public void setValue(MandateAcceptance5 obj, AcceptanceResult6 value) {
			obj.setAcceptanceResult(value);
		}
	};
	@XmlElement(name = "OrgnlMndt")
	protected OriginalMandate5Choice originalMandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate5Choice
	 * OriginalMandate5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmOriginalMandate
	 * Mandate.mmOriginalMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5
	 * MandateAcceptance5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMndt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the original mandate data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance4#mmOriginalMandate
	 * MandateAcceptance4.mmOriginalMandate}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateAcceptance5, Optional<OriginalMandate5Choice>> mmOriginalMandate = new MMMessageAssociationEnd<MandateAcceptance5, Optional<OriginalMandate5Choice>>() {
		{
			businessElementTrace_lazy = () -> Mandate.mmOriginalMandate;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateAcceptance5.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandate";
			definition = "Provides the original mandate data.";
			previousVersion_lazy = () -> MandateAcceptance4.mmOriginalMandate;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalMandate5Choice.mmObject();
		}

		@Override
		public Optional<OriginalMandate5Choice> getValue(MandateAcceptance5 obj) {
			return obj.getOriginalMandate();
		}

		@Override
		public void setValue(MandateAcceptance5 obj, Optional<OriginalMandate5Choice> value) {
			obj.setOriginalMandate(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5
	 * MandateAcceptance5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance4#mmSupplementaryData
	 * MandateAcceptance4.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MandateAcceptance5, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAttribute<MandateAcceptance5, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateAcceptance5.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> MandateAcceptance4.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MandateAcceptance5 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MandateAcceptance5 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAcceptance5.mmOriginalMessageInformation, com.tools20022.repository.msg.MandateAcceptance5.mmAcceptanceResult,
						com.tools20022.repository.msg.MandateAcceptance5.mmOriginalMandate, com.tools20022.repository.msg.MandateAcceptance5.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(MandateAcceptanceReportV05.mmUnderlyingAcceptanceDetails);
				trace_lazy = () -> DirectDebitMandate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOriginalMandateIdentificationPresenceRule.forMandateAcceptance5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateAcceptance5";
				definition = "Identifies the mandate, which is being accepted.";
				previousVersion_lazy = () -> MandateAcceptance4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<OriginalMessageInformation1> getOriginalMessageInformation() {
		return originalMessageInformation == null ? Optional.empty() : Optional.of(originalMessageInformation);
	}

	public MandateAcceptance5 setOriginalMessageInformation(OriginalMessageInformation1 originalMessageInformation) {
		this.originalMessageInformation = originalMessageInformation;
		return this;
	}

	public AcceptanceResult6 getAcceptanceResult() {
		return acceptanceResult;
	}

	public MandateAcceptance5 setAcceptanceResult(AcceptanceResult6 acceptanceResult) {
		this.acceptanceResult = Objects.requireNonNull(acceptanceResult);
		return this;
	}

	public Optional<OriginalMandate5Choice> getOriginalMandate() {
		return originalMandate == null ? Optional.empty() : Optional.of(originalMandate);
	}

	public MandateAcceptance5 setOriginalMandate(OriginalMandate5Choice originalMandate) {
		this.originalMandate = originalMandate;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MandateAcceptance5 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}