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
import com.tools20022.repository.codeset.UKTaxGroupUnitCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SecuritiesCertificate;
import com.tools20022.repository.entity.SecuritiesEntry;
import com.tools20022.repository.entity.SecuritiesQuantity;
import com.tools20022.repository.entity.Security;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentQuantity1;
import com.tools20022.repository.msg.UnitPrice12;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the units to settle.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Unit3#mmUnitsNumber
 * Unit3.mmUnitsNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit3#mmAcquisitionDate
 * Unit3.mmAcquisitionDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit3#mmCertificateNumber
 * Unit3.mmCertificateNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit3#mmGroup1Or2Units
 * Unit3.mmGroup1Or2Units}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Unit3#mmPriceDetails
 * Unit3.mmPriceDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesQuantity
 * SecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Unit3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about the units to settle."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Unit6 Unit6}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Unit3", propOrder = {"unitsNumber", "acquisitionDate", "certificateNumber", "group1Or2Units", "priceDetails"})
public class Unit3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UnitsNb", required = true)
	protected FinancialInstrumentQuantity1 unitsNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmUnit
	 * SecuritiesQuantity.mmUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Unit3
	 * Unit3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities to be settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit6#mmUnitsNumber
	 * Unit6.mmUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Unit3, FinancialInstrumentQuantity1> mmUnitsNumber = new MMMessageAttribute<Unit3, FinancialInstrumentQuantity1>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmUnit;
			componentContext_lazy = () -> com.tools20022.repository.msg.Unit3.mmObject();
			isDerived = false;
			xmlTag = "UnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Total quantity of securities to be settled.";
			nextVersions_lazy = () -> Arrays.asList(Unit6.mmUnitsNumber);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> FinancialInstrumentQuantity1.mmObject();
		}

		@Override
		public FinancialInstrumentQuantity1 getValue(Unit3 obj) {
			return obj.getUnitsNumber();
		}

		@Override
		public void setValue(Unit3 obj, FinancialInstrumentQuantity1 value) {
			obj.setUnitsNumber(value);
		}
	};
	@XmlElement(name = "AcqstnDt")
	protected ISODate acquisitionDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesEntry#mmAcquisitionDate
	 * SecuritiesEntry.mmAcquisitionDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Unit3
	 * Unit3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcqstnDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquisitionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date upon which the investor purchased the financial instrument."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit6#mmAcquisitionDate
	 * Unit6.mmAcquisitionDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Unit3, Optional<ISODate>> mmAcquisitionDate = new MMMessageAttribute<Unit3, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesEntry.mmAcquisitionDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Unit3.mmObject();
			isDerived = false;
			xmlTag = "AcqstnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquisitionDate";
			definition = "Date upon which the investor purchased the financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(Unit6.mmAcquisitionDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(Unit3 obj) {
			return obj.getAcquisitionDate();
		}

		@Override
		public void setValue(Unit3 obj, Optional<ISODate> value) {
			obj.setAcquisitionDate(value.orElse(null));
		}
	};
	@XmlElement(name = "CertNb")
	protected List<Max35Text> certificateNumber;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesCertificate#mmNumber
	 * SecuritiesCertificate.mmNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Unit3
	 * Unit3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertNb"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate representing the security that is delivered."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit6#mmCertificateNumber
	 * Unit6.mmCertificateNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Unit3, List<Max35Text>> mmCertificateNumber = new MMMessageAttribute<Unit3, List<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesCertificate.mmNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.Unit3.mmObject();
			isDerived = false;
			xmlTag = "CertNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateNumber";
			definition = "Certificate representing the security that is delivered.";
			nextVersions_lazy = () -> Arrays.asList(Unit6.mmCertificateNumber);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(Unit3 obj) {
			return obj.getCertificateNumber();
		}

		@Override
		public void setValue(Unit3 obj, List<Max35Text> value) {
			obj.setCertificateNumber(value);
		}
	};
	@XmlElement(name = "Grp1Or2Units")
	protected UKTaxGroupUnitCode group1Or2Units;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UKTaxGroupUnitCode
	 * UKTaxGroupUnitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmGroup1Or2Units
	 * SecuritiesQuantity.mmGroup1Or2Units}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Unit3
	 * Unit3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grp1Or2Units"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Group1Or2Units"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tax group to which the purchased investment fund units belong. The investor indicates to the intermediary operating pooled nominees, which type of unit is to be sold."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit6#mmGroup1Or2Units
	 * Unit6.mmGroup1Or2Units}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Unit3, Optional<UKTaxGroupUnitCode>> mmGroup1Or2Units = new MMMessageAttribute<Unit3, Optional<UKTaxGroupUnitCode>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmGroup1Or2Units;
			componentContext_lazy = () -> com.tools20022.repository.msg.Unit3.mmObject();
			isDerived = false;
			xmlTag = "Grp1Or2Units";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Group1Or2Units";
			definition = "Tax group to which the purchased investment fund units belong. The investor indicates to the intermediary operating pooled nominees, which type of unit is to be sold.";
			nextVersions_lazy = () -> Arrays.asList(Unit6.mmGroup1Or2Units);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> UKTaxGroupUnitCode.mmObject();
		}

		@Override
		public Optional<UKTaxGroupUnitCode> getValue(Unit3 obj) {
			return obj.getGroup1Or2Units();
		}

		@Override
		public void setValue(Unit3 obj, Optional<UKTaxGroupUnitCode> value) {
			obj.setGroup1Or2Units(value.orElse(null));
		}
	};
	@XmlElement(name = "PricDtls")
	protected UnitPrice12 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice12
	 * UnitPrice12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Unit3
	 * Unit3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the price of the transferred units."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Unit6#mmPriceDetails
	 * Unit6.mmPriceDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Unit3, Optional<UnitPrice12>> mmPriceDetails = new MMMessageAssociationEnd<Unit3, Optional<UnitPrice12>>() {
		{
			businessElementTrace_lazy = () -> Security.mmPricing;
			componentContext_lazy = () -> com.tools20022.repository.msg.Unit3.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Information related to the price of the transferred units.";
			nextVersions_lazy = () -> Arrays.asList(Unit6.mmPriceDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UnitPrice12.mmObject();
		}

		@Override
		public Optional<UnitPrice12> getValue(Unit3 obj) {
			return obj.getPriceDetails();
		}

		@Override
		public void setValue(Unit3 obj, Optional<UnitPrice12> value) {
			obj.setPriceDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Unit3.mmUnitsNumber, com.tools20022.repository.msg.Unit3.mmAcquisitionDate, com.tools20022.repository.msg.Unit3.mmCertificateNumber,
						com.tools20022.repository.msg.Unit3.mmGroup1Or2Units, com.tools20022.repository.msg.Unit3.mmPriceDetails);
				trace_lazy = () -> SecuritiesQuantity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Unit3";
				definition = "Information about the units to settle.";
				nextVersions_lazy = () -> Arrays.asList(Unit6.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstrumentQuantity1 getUnitsNumber() {
		return unitsNumber;
	}

	public Unit3 setUnitsNumber(FinancialInstrumentQuantity1 unitsNumber) {
		this.unitsNumber = Objects.requireNonNull(unitsNumber);
		return this;
	}

	public Optional<ISODate> getAcquisitionDate() {
		return acquisitionDate == null ? Optional.empty() : Optional.of(acquisitionDate);
	}

	public Unit3 setAcquisitionDate(ISODate acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
		return this;
	}

	public List<Max35Text> getCertificateNumber() {
		return certificateNumber == null ? certificateNumber = new ArrayList<>() : certificateNumber;
	}

	public Unit3 setCertificateNumber(List<Max35Text> certificateNumber) {
		this.certificateNumber = Objects.requireNonNull(certificateNumber);
		return this;
	}

	public Optional<UKTaxGroupUnitCode> getGroup1Or2Units() {
		return group1Or2Units == null ? Optional.empty() : Optional.of(group1Or2Units);
	}

	public Unit3 setGroup1Or2Units(UKTaxGroupUnitCode group1Or2Units) {
		this.group1Or2Units = group1Or2Units;
		return this;
	}

	public Optional<UnitPrice12> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public Unit3 setPriceDetails(UnitPrice12 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}
}