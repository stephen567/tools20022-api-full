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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.MasterAgreement;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Rules which apply to the BPO (Bank Payment Obligation).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BPOApplicableRules1Choice#mmURBPOVersion
 * BPOApplicableRules1Choice.mmURBPOVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BPOApplicableRules1Choice#mmOtherRulesAndVersion
 * BPOApplicableRules1Choice.mmOtherRulesAndVersion}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BPOApplicableRules1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Rules which apply to the BPO (Bank Payment Obligation)."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BPOApplicableRules1Choice", propOrder = {"uRBPOVersion", "otherRulesAndVersion"})
public class BPOApplicableRules1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "URBPOVrsn", required = true)
	protected DecimalNumber uRBPOVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BPOApplicableRules1Choice
	 * BPOApplicableRules1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "URBPOVrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "URBPOVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "URBPO are rules that apply to a BPO when the Payment Obligation Segment within an Established Baseline expressly states that it is subject to these rules or when each Involved Bank agrees in a separate agreement that a BPO is subject to these rules. If an Established Baseline or separate agreement does not indicate the applicable version of URBPO, the BPO will be subject to the latest version in effect when the Baseline is established in accordance with sub-article 9 (d)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BPOApplicableRules1Choice, DecimalNumber> mmURBPOVersion = new MMMessageAttribute<BPOApplicableRules1Choice, DecimalNumber>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.BPOApplicableRules1Choice.mmObject();
			isDerived = false;
			xmlTag = "URBPOVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "URBPOVersion";
			definition = "URBPO are rules that apply to a BPO when the Payment Obligation Segment within an Established Baseline expressly states that it is subject to these rules or when each Involved Bank agrees in a separate agreement that a BPO is subject to these rules. If an Established Baseline or separate agreement does not indicate the applicable version of URBPO, the BPO will be subject to the latest version in effect when the Baseline is established in accordance with sub-article 9 (d).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(BPOApplicableRules1Choice obj) {
			return obj.getURBPOVersion();
		}

		@Override
		public void setValue(BPOApplicableRules1Choice obj, DecimalNumber value) {
			obj.setURBPOVersion(value);
		}
	};
	@XmlElement(name = "OthrRulesAndVrsn", required = true)
	protected Max35Text otherRulesAndVersion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MasterAgreement
	 * MasterAgreement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BPOApplicableRules1Choice
	 * BPOApplicableRules1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrRulesAndVrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherRulesAndVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Applicable rules are not URBPO and are specified here with version."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<BPOApplicableRules1Choice, Max35Text> mmOtherRulesAndVersion = new MMMessageAttribute<BPOApplicableRules1Choice, Max35Text>() {
		{
			businessComponentTrace_lazy = () -> MasterAgreement.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.BPOApplicableRules1Choice.mmObject();
			isDerived = false;
			xmlTag = "OthrRulesAndVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherRulesAndVersion";
			definition = "Applicable rules are not URBPO and are specified here with version.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(BPOApplicableRules1Choice obj) {
			return obj.getOtherRulesAndVersion();
		}

		@Override
		public void setValue(BPOApplicableRules1Choice obj, Max35Text value) {
			obj.setOtherRulesAndVersion(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BPOApplicableRules1Choice.mmURBPOVersion, com.tools20022.repository.choice.BPOApplicableRules1Choice.mmOtherRulesAndVersion);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BPOApplicableRules1Choice";
				definition = "Rules which apply to the BPO (Bank Payment Obligation).";
			}
		});
		return mmObject_lazy.get();
	}

	public DecimalNumber getURBPOVersion() {
		return uRBPOVersion;
	}

	public BPOApplicableRules1Choice setURBPOVersion(DecimalNumber uRBPOVersion) {
		this.uRBPOVersion = Objects.requireNonNull(uRBPOVersion);
		return this;
	}

	public Max35Text getOtherRulesAndVersion() {
		return otherRulesAndVersion;
	}

	public BPOApplicableRules1Choice setOtherRulesAndVersion(Max35Text otherRulesAndVersion) {
		this.otherRulesAndVersion = Objects.requireNonNull(otherRulesAndVersion);
		return this;
	}
}