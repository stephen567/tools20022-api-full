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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.RateAndAmountFormat36Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Dividend;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Extension for updated additional information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3#mmPlaceAndName
 * UpdatedAdditionalInformation5SD3.mmPlaceAndName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3#mmDistributionAmountPerShare
 * UpdatedAdditionalInformation5SD3.mmDistributionAmountPerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3#mmNetAssetDecreaseRatio
 * UpdatedAdditionalInformation5SD3.mmNetAssetDecreaseRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3#mmAccumulatedProfitPerShare
 * UpdatedAdditionalInformation5SD3.mmAccumulatedProfitPerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3#mmDeemedDividendPerShare
 * UpdatedAdditionalInformation5SD3.mmDeemedDividendPerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3#mmResidualDistributionAmountPerShare
 * UpdatedAdditionalInformation5SD3.mmResidualDistributionAmountPerShare}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UpdatedAdditionalInformation5SD3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Extension for updated additional information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintUseOfShareholderListRegistrarContactDetailsRule#forUpdatedAdditionalInformation5SD3
 * ConstraintUseOfShareholderListRegistrarContactDetailsRule.
 * forUpdatedAdditionalInformation5SD3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD1
 * UpdatedAdditionalInformation5SD1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UpdatedAdditionalInformation5SD3", propOrder = {"placeAndName", "distributionAmountPerShare", "netAssetDecreaseRatio", "accumulatedProfitPerShare", "deemedDividendPerShare", "residualDistributionAmountPerShare"})
public class UpdatedAdditionalInformation5SD3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PlcAndNm")
	protected Max350Text placeAndName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3
	 * UpdatedAdditionalInformation5SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PlcAndNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceAndName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD1#mmPlaceAndName
	 * UpdatedAdditionalInformation5SD1.mmPlaceAndName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UpdatedAdditionalInformation5SD3, Optional<Max350Text>> mmPlaceAndName = new MMMessageAttribute<UpdatedAdditionalInformation5SD3, Optional<Max350Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3.mmObject();
			isDerived = false;
			xmlTag = "PlcAndNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceAndName";
			definition = "Unambiguous reference to the location where the supplementary data must be inserted in the message instance. \r\n\r\nIn the case of XML, this is expressed by a valid XPath.";
			previousVersion_lazy = () -> UpdatedAdditionalInformation5SD1.mmPlaceAndName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(UpdatedAdditionalInformation5SD3 obj) {
			return obj.getPlaceAndName();
		}

		@Override
		public void setValue(UpdatedAdditionalInformation5SD3 obj, Optional<Max350Text> value) {
			obj.setPlaceAndName(value.orElse(null));
		}
	};
	@XmlElement(name = "DstrbtnAmtPerShr")
	protected RateAndAmountFormat36Choice distributionAmountPerShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat36Choice
	 * RateAndAmountFormat36Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3
	 * UpdatedAdditionalInformation5SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DstrbtnAmtPerShr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionAmountPerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total distribution fund rate per share.\r\n一株あたりの交付金先等の額."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD1#mmDistributionAmountPerShare
	 * UpdatedAdditionalInformation5SD1.mmDistributionAmountPerShare}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UpdatedAdditionalInformation5SD3, Optional<RateAndAmountFormat36Choice>> mmDistributionAmountPerShare = new MMMessageAttribute<UpdatedAdditionalInformation5SD3, Optional<RateAndAmountFormat36Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3.mmObject();
			isDerived = false;
			xmlTag = "DstrbtnAmtPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionAmountPerShare";
			definition = "Total distribution fund rate per share.\r\n一株あたりの交付金先等の額.";
			previousVersion_lazy = () -> UpdatedAdditionalInformation5SD1.mmDistributionAmountPerShare;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat36Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat36Choice> getValue(UpdatedAdditionalInformation5SD3 obj) {
			return obj.getDistributionAmountPerShare();
		}

		@Override
		public void setValue(UpdatedAdditionalInformation5SD3 obj, Optional<RateAndAmountFormat36Choice> value) {
			obj.setDistributionAmountPerShare(value.orElse(null));
		}
	};
	@XmlElement(name = "NetAsstDcrRatio")
	protected PercentageRate netAssetDecreaseRatio;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
	 * Dividend.mmGrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3
	 * UpdatedAdditionalInformation5SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAsstDcrRatio"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetDecreaseRatio"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate information of how much net asset decrease happens as a result of the fund distribution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD1#mmNetAssetDecreaseRatio
	 * UpdatedAdditionalInformation5SD1.mmNetAssetDecreaseRatio}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UpdatedAdditionalInformation5SD3, Optional<PercentageRate>> mmNetAssetDecreaseRatio = new MMMessageAttribute<UpdatedAdditionalInformation5SD3, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmGrossDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3.mmObject();
			isDerived = false;
			xmlTag = "NetAsstDcrRatio";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAssetDecreaseRatio";
			definition = "Rate information of how much net asset decrease happens as a result of the fund distribution.";
			previousVersion_lazy = () -> UpdatedAdditionalInformation5SD1.mmNetAssetDecreaseRatio;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(UpdatedAdditionalInformation5SD3 obj) {
			return obj.getNetAssetDecreaseRatio();
		}

		@Override
		public void setValue(UpdatedAdditionalInformation5SD3 obj, Optional<PercentageRate> value) {
			obj.setNetAssetDecreaseRatio(value.orElse(null));
		}
	};
	@XmlElement(name = "AcmltdPrftPerShr")
	protected RateAndAmountFormat36Choice accumulatedProfitPerShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat36Choice
	 * RateAndAmountFormat36Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
	 * Dividend.mmGrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3
	 * UpdatedAdditionalInformation5SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcmltdPrftPerShr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulatedProfitPerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution amount of accumulated profit per share.\r\n一株あたり利益剰余金の額."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD1#mmAccumulatedProfitPerShare
	 * UpdatedAdditionalInformation5SD1.mmAccumulatedProfitPerShare}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UpdatedAdditionalInformation5SD3, Optional<RateAndAmountFormat36Choice>> mmAccumulatedProfitPerShare = new MMMessageAttribute<UpdatedAdditionalInformation5SD3, Optional<RateAndAmountFormat36Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmGrossDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3.mmObject();
			isDerived = false;
			xmlTag = "AcmltdPrftPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulatedProfitPerShare";
			definition = "Distribution amount of accumulated profit per share.\r\n一株あたり利益剰余金の額.";
			previousVersion_lazy = () -> UpdatedAdditionalInformation5SD1.mmAccumulatedProfitPerShare;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat36Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat36Choice> getValue(UpdatedAdditionalInformation5SD3 obj) {
			return obj.getAccumulatedProfitPerShare();
		}

		@Override
		public void setValue(UpdatedAdditionalInformation5SD3 obj, Optional<RateAndAmountFormat36Choice> value) {
			obj.setAccumulatedProfitPerShare(value.orElse(null));
		}
	};
	@XmlElement(name = "DmdDvddPerShr")
	protected RateAndAmountFormat36Choice deemedDividendPerShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat36Choice
	 * RateAndAmountFormat36Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3
	 * UpdatedAdditionalInformation5SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DmdDvddPerShr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedDividendPerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Taxable distribution amount of dividend.\r\n一株あたりみなし配当の額."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD1#mmDeemedDividendPerShare
	 * UpdatedAdditionalInformation5SD1.mmDeemedDividendPerShare}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UpdatedAdditionalInformation5SD3, Optional<RateAndAmountFormat36Choice>> mmDeemedDividendPerShare = new MMMessageAttribute<UpdatedAdditionalInformation5SD3, Optional<RateAndAmountFormat36Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3.mmObject();
			isDerived = false;
			xmlTag = "DmdDvddPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedDividendPerShare";
			definition = "Taxable distribution amount of dividend.\r\n一株あたりみなし配当の額.";
			previousVersion_lazy = () -> UpdatedAdditionalInformation5SD1.mmDeemedDividendPerShare;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat36Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat36Choice> getValue(UpdatedAdditionalInformation5SD3 obj) {
			return obj.getDeemedDividendPerShare();
		}

		@Override
		public void setValue(UpdatedAdditionalInformation5SD3 obj, Optional<RateAndAmountFormat36Choice> value) {
			obj.setDeemedDividendPerShare(value.orElse(null));
		}
	};
	@XmlElement(name = "RsdlDstrbtnAmtPerShr")
	protected RateAndAmountFormat36Choice residualDistributionAmountPerShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat36Choice
	 * RateAndAmountFormat36Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3
	 * UpdatedAdditionalInformation5SD3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsdlDstrbtnAmtPerShr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResidualDistributionAmountPerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax exempted distribution amount of dividend. \r\n一株あたりみなし譲渡収入の額."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation5SD1#mmResidualDistributionAmountPerShare
	 * UpdatedAdditionalInformation5SD1.mmResidualDistributionAmountPerShare}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UpdatedAdditionalInformation5SD3, Optional<RateAndAmountFormat36Choice>> mmResidualDistributionAmountPerShare = new MMMessageAttribute<UpdatedAdditionalInformation5SD3, Optional<RateAndAmountFormat36Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3.mmObject();
			isDerived = false;
			xmlTag = "RsdlDstrbtnAmtPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidualDistributionAmountPerShare";
			definition = "Tax exempted distribution amount of dividend. \r\n一株あたりみなし譲渡収入の額.";
			previousVersion_lazy = () -> UpdatedAdditionalInformation5SD1.mmResidualDistributionAmountPerShare;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat36Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat36Choice> getValue(UpdatedAdditionalInformation5SD3 obj) {
			return obj.getResidualDistributionAmountPerShare();
		}

		@Override
		public void setValue(UpdatedAdditionalInformation5SD3 obj, Optional<RateAndAmountFormat36Choice> value) {
			obj.setResidualDistributionAmountPerShare(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3.mmPlaceAndName, com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3.mmDistributionAmountPerShare,
						com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3.mmNetAssetDecreaseRatio, com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3.mmAccumulatedProfitPerShare,
						com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3.mmDeemedDividendPerShare, com.tools20022.repository.msg.UpdatedAdditionalInformation5SD3.mmResidualDistributionAmountPerShare);
				trace_lazy = () -> Dividend.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintUseOfShareholderListRegistrarContactDetailsRule.forUpdatedAdditionalInformation5SD3);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "UpdatedAdditionalInformation5SD3";
				definition = "Extension for updated additional information.";
				previousVersion_lazy = () -> UpdatedAdditionalInformation5SD1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max350Text> getPlaceAndName() {
		return placeAndName == null ? Optional.empty() : Optional.of(placeAndName);
	}

	public UpdatedAdditionalInformation5SD3 setPlaceAndName(Max350Text placeAndName) {
		this.placeAndName = placeAndName;
		return this;
	}

	public Optional<RateAndAmountFormat36Choice> getDistributionAmountPerShare() {
		return distributionAmountPerShare == null ? Optional.empty() : Optional.of(distributionAmountPerShare);
	}

	public UpdatedAdditionalInformation5SD3 setDistributionAmountPerShare(RateAndAmountFormat36Choice distributionAmountPerShare) {
		this.distributionAmountPerShare = distributionAmountPerShare;
		return this;
	}

	public Optional<PercentageRate> getNetAssetDecreaseRatio() {
		return netAssetDecreaseRatio == null ? Optional.empty() : Optional.of(netAssetDecreaseRatio);
	}

	public UpdatedAdditionalInformation5SD3 setNetAssetDecreaseRatio(PercentageRate netAssetDecreaseRatio) {
		this.netAssetDecreaseRatio = netAssetDecreaseRatio;
		return this;
	}

	public Optional<RateAndAmountFormat36Choice> getAccumulatedProfitPerShare() {
		return accumulatedProfitPerShare == null ? Optional.empty() : Optional.of(accumulatedProfitPerShare);
	}

	public UpdatedAdditionalInformation5SD3 setAccumulatedProfitPerShare(RateAndAmountFormat36Choice accumulatedProfitPerShare) {
		this.accumulatedProfitPerShare = accumulatedProfitPerShare;
		return this;
	}

	public Optional<RateAndAmountFormat36Choice> getDeemedDividendPerShare() {
		return deemedDividendPerShare == null ? Optional.empty() : Optional.of(deemedDividendPerShare);
	}

	public UpdatedAdditionalInformation5SD3 setDeemedDividendPerShare(RateAndAmountFormat36Choice deemedDividendPerShare) {
		this.deemedDividendPerShare = deemedDividendPerShare;
		return this;
	}

	public Optional<RateAndAmountFormat36Choice> getResidualDistributionAmountPerShare() {
		return residualDistributionAmountPerShare == null ? Optional.empty() : Optional.of(residualDistributionAmountPerShare);
	}

	public UpdatedAdditionalInformation5SD3 setResidualDistributionAmountPerShare(RateAndAmountFormat36Choice residualDistributionAmountPerShare) {
		this.residualDistributionAmountPerShare = residualDistributionAmountPerShare;
		return this;
	}
}