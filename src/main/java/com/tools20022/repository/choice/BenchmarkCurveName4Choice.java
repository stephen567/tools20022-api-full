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
import com.tools20022.repository.codeset.BenchmarkCurveName2Code;
import com.tools20022.repository.datatype.ISINOct2015Identifier;
import com.tools20022.repository.datatype.Max25Text;
import com.tools20022.repository.entity.Curve;
import com.tools20022.repository.entity.SecuritiesIdentification;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format for benchmark curve name.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice#mmISIN
 * BenchmarkCurveName4Choice.mmISIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice#mmIndex
 * BenchmarkCurveName4Choice.mmIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice#mmName
 * BenchmarkCurveName4Choice.mmName}</li>
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
 * "BenchmarkCurveName4Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format for benchmark curve name."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.BenchmarkCurveName5Choice
 * BenchmarkCurveName5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice
 * BenchmarkCurveName6Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName2Choice
 * BenchmarkCurveName2Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BenchmarkCurveName4Choice", propOrder = {"iSIN", "index", "name"})
public class BenchmarkCurveName4Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ISIN", required = true)
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
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice
	 * BenchmarkCurveName4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ISIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ISIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "International Securities Identification Number (ISIN), when it exists for the reference rate."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice#mmISIN
	 * BenchmarkCurveName6Choice.mmISIN}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmISIN = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesIdentification.mmSecurityIdentification;
			componentContext_lazy = () -> com.tools20022.repository.choice.BenchmarkCurveName4Choice.mmObject();
			isDerived = false;
			xmlTag = "ISIN";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ISIN";
			definition = "International Securities Identification Number (ISIN), when it exists for the reference rate.";
			nextVersions_lazy = () -> Arrays.asList(BenchmarkCurveName6Choice.mmISIN);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISINOct2015Identifier.mmObject();
		}
	};
	@XmlElement(name = "Indx", required = true)
	protected BenchmarkCurveName2Code index;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BenchmarkCurveName2Code
	 * BenchmarkCurveName2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Curve#mmName Curve.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice
	 * BenchmarkCurveName4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Indx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifier of the index/benchmark of a floating rate bond, when an identifier exists."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName5Choice#mmIndex
	 * BenchmarkCurveName5Choice.mmIndex}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice#mmIndex
	 * BenchmarkCurveName6Choice.mmIndex}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName2Choice#mmCode
	 * BenchmarkCurveName2Choice.mmCode}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndex = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Curve.mmName;
			componentContext_lazy = () -> com.tools20022.repository.choice.BenchmarkCurveName4Choice.mmObject();
			isDerived = false;
			xmlTag = "Indx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Index";
			definition = "Identifier of the index/benchmark of a floating rate bond, when an identifier exists.";
			nextVersions_lazy = () -> Arrays.asList(BenchmarkCurveName5Choice.mmIndex, BenchmarkCurveName6Choice.mmIndex);
			previousVersion_lazy = () -> BenchmarkCurveName2Choice.mmCode;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BenchmarkCurveName2Code.mmObject();
		}
	};
	@XmlElement(name = "Nm", required = true)
	protected Max25Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max25Text
	 * Max25Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Curve#mmName Curve.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName4Choice
	 * BenchmarkCurveName4Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Where no identifier exists, standardized name of the index, including its term (such as ‘EURIBOR6M’, ‘LIBOR3M’)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName5Choice#mmName
	 * BenchmarkCurveName5Choice.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName6Choice#mmName
	 * BenchmarkCurveName6Choice.mmName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.choice.BenchmarkCurveName2Choice#mmProprietary
	 * BenchmarkCurveName2Choice.mmProprietary}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Curve.mmName;
			componentContext_lazy = () -> com.tools20022.repository.choice.BenchmarkCurveName4Choice.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Where no identifier exists, standardized name of the index, including its term (such as ‘EURIBOR6M’, ‘LIBOR3M’).";
			nextVersions_lazy = () -> Arrays.asList(BenchmarkCurveName5Choice.mmName, BenchmarkCurveName6Choice.mmName);
			previousVersion_lazy = () -> BenchmarkCurveName2Choice.mmProprietary;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max25Text.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.BenchmarkCurveName4Choice.mmISIN, com.tools20022.repository.choice.BenchmarkCurveName4Choice.mmIndex,
						com.tools20022.repository.choice.BenchmarkCurveName4Choice.mmName);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BenchmarkCurveName4Choice";
				definition = "Choice of format for benchmark curve name.";
				nextVersions_lazy = () -> Arrays.asList(BenchmarkCurveName5Choice.mmObject(), BenchmarkCurveName6Choice.mmObject());
				previousVersion_lazy = () -> BenchmarkCurveName2Choice.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ISINOct2015Identifier getISIN() {
		return iSIN;
	}

	public BenchmarkCurveName4Choice setISIN(ISINOct2015Identifier iSIN) {
		this.iSIN = Objects.requireNonNull(iSIN);
		return this;
	}

	public BenchmarkCurveName2Code getIndex() {
		return index;
	}

	public BenchmarkCurveName4Choice setIndex(BenchmarkCurveName2Code index) {
		this.index = Objects.requireNonNull(index);
		return this;
	}

	public Max25Text getName() {
		return name;
	}

	public BenchmarkCurveName4Choice setName(Max25Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}
}