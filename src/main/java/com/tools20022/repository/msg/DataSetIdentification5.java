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
import com.tools20022.repository.codeset.DataSetCategory8Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identification of a data set.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.DataSetIdentification5#mmName
 * DataSetIdentification5.mmName}</li>
 * <li>{@linkplain com.tools20022.repository.msg.DataSetIdentification5#mmType
 * DataSetIdentification5.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DataSetIdentification5#mmVersion
 * DataSetIdentification5.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DataSetIdentification5#mmCreationDateTime
 * DataSetIdentification5.mmCreationDateTime}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DataSetIdentification5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identification of a data set."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.DataSetIdentification1
 * DataSetIdentification1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DataSetIdentification5", propOrder = {"name", "type", "version", "creationDateTime"})
public class DataSetIdentification5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Nm", required = true)
	protected Max256Text name;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DataSetIdentification5
	 * DataSetIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Name"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the data set."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DataSetIdentification1#mmName
	 * DataSetIdentification1.mmName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DataSetIdentification5, Max256Text> mmName = new MMMessageAttribute<DataSetIdentification5, Max256Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DataSetIdentification5.mmObject();
			isDerived = false;
			xmlTag = "Nm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Name";
			definition = "Name of the data set.";
			previousVersion_lazy = () -> DataSetIdentification1.mmName;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Max256Text getValue(DataSetIdentification5 obj) {
			return obj.getName();
		}

		@Override
		public void setValue(DataSetIdentification5 obj, Max256Text value) {
			obj.setName(value);
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected DataSetCategory8Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DataSetCategory8Code
	 * DataSetCategory8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DataSetIdentification5
	 * DataSetIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Category of data set."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DataSetIdentification1#mmType
	 * DataSetIdentification1.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DataSetIdentification5, DataSetCategory8Code> mmType = new MMMessageAttribute<DataSetIdentification5, DataSetCategory8Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DataSetIdentification5.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Category of data set.";
			previousVersion_lazy = () -> DataSetIdentification1.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DataSetCategory8Code.mmObject();
		}

		@Override
		public DataSetCategory8Code getValue(DataSetIdentification5 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(DataSetIdentification5 obj, DataSetCategory8Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Vrsn")
	protected Max256Text version;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DataSetIdentification5
	 * DataSetIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the data set."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DataSetIdentification1#mmVersion
	 * DataSetIdentification1.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DataSetIdentification5, Optional<Max256Text>> mmVersion = new MMMessageAttribute<DataSetIdentification5, Optional<Max256Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DataSetIdentification5.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the data set.";
			previousVersion_lazy = () -> DataSetIdentification1.mmVersion;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}

		@Override
		public Optional<Max256Text> getValue(DataSetIdentification5 obj) {
			return obj.getVersion();
		}

		@Override
		public void setValue(DataSetIdentification5 obj, Optional<Max256Text> value) {
			obj.setVersion(value.orElse(null));
		}
	};
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DataSetIdentification5
	 * DataSetIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time of creation of the data set."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.DataSetIdentification1#mmCreationDateTime
	 * DataSetIdentification1.mmCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<DataSetIdentification5, ISODateTime> mmCreationDateTime = new MMMessageAttribute<DataSetIdentification5, ISODateTime>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DataSetIdentification5.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time of creation of the data set.";
			previousVersion_lazy = () -> DataSetIdentification1.mmCreationDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(DataSetIdentification5 obj) {
			return obj.getCreationDateTime();
		}

		@Override
		public void setValue(DataSetIdentification5 obj, ISODateTime value) {
			obj.setCreationDateTime(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DataSetIdentification5.mmName, com.tools20022.repository.msg.DataSetIdentification5.mmType,
						com.tools20022.repository.msg.DataSetIdentification5.mmVersion, com.tools20022.repository.msg.DataSetIdentification5.mmCreationDateTime);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DataSetIdentification5";
				definition = "Identification of a data set.";
				previousVersion_lazy = () -> DataSetIdentification1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max256Text getName() {
		return name;
	}

	public DataSetIdentification5 setName(Max256Text name) {
		this.name = Objects.requireNonNull(name);
		return this;
	}

	public DataSetCategory8Code getType() {
		return type;
	}

	public DataSetIdentification5 setType(DataSetCategory8Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<Max256Text> getVersion() {
		return version == null ? Optional.empty() : Optional.of(version);
	}

	public DataSetIdentification5 setVersion(Max256Text version) {
		this.version = version;
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public DataSetIdentification5 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}
}