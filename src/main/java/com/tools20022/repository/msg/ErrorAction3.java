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
import com.tools20022.repository.codeset.TerminalManagementActionResult3Code;
import com.tools20022.repository.codeset.TerminalManagementErrorAction2Code;
import com.tools20022.repository.entity.TerminalManagementAction;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Action to perform in case of error on the related action in progress.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ErrorAction3#mmActionResult
 * ErrorAction3.mmActionResult}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ErrorAction3#mmActionToProcess
 * ErrorAction3.mmActionToProcess}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction
 * TerminalManagementAction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ErrorAction3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Action to perform in case of error on the related action in progress."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ErrorAction4 ErrorAction4}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.ErrorAction2
 * ErrorAction2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ErrorAction3", propOrder = {"actionResult", "actionToProcess"})
public class ErrorAction3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ActnRslt", required = true)
	protected List<TerminalManagementActionResult3Code> actionResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmActionResult
	 * TerminalManagementAction.mmActionResult}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ErrorAction3 ErrorAction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnRslt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "List of error action result codes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ErrorAction4#mmActionResult
	 * ErrorAction4.mmActionResult}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ErrorAction2#mmActionResult
	 * ErrorAction2.mmActionResult}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ErrorAction3, List<TerminalManagementActionResult3Code>> mmActionResult = new MMMessageAttribute<ErrorAction3, List<TerminalManagementActionResult3Code>>() {
		{
			businessElementTrace_lazy = () -> TerminalManagementAction.mmActionResult;
			componentContext_lazy = () -> com.tools20022.repository.msg.ErrorAction3.mmObject();
			isDerived = false;
			xmlTag = "ActnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionResult";
			definition = "List of error action result codes.";
			nextVersions_lazy = () -> Arrays.asList(ErrorAction4.mmActionResult);
			previousVersion_lazy = () -> ErrorAction2.mmActionResult;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementActionResult3Code.mmObject();
		}

		@Override
		public List<TerminalManagementActionResult3Code> getValue(ErrorAction3 obj) {
			return obj.getActionResult();
		}

		@Override
		public void setValue(ErrorAction3 obj, List<TerminalManagementActionResult3Code> value) {
			obj.setActionResult(value);
		}
	};
	@XmlElement(name = "ActnToPrc", required = true)
	protected TerminalManagementErrorAction2Code actionToProcess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorAction2Code
	 * TerminalManagementErrorAction2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TerminalManagementAction#mmActionToProcess
	 * TerminalManagementAction.mmActionToProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ErrorAction3 ErrorAction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnToPrc"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionToProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Action to be processed for the related errors."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ErrorAction4#mmActionToProcess
	 * ErrorAction4.mmActionToProcess}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ErrorAction2#mmActionToProcess
	 * ErrorAction2.mmActionToProcess}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ErrorAction3, TerminalManagementErrorAction2Code> mmActionToProcess = new MMMessageAttribute<ErrorAction3, TerminalManagementErrorAction2Code>() {
		{
			businessElementTrace_lazy = () -> TerminalManagementAction.mmActionToProcess;
			componentContext_lazy = () -> com.tools20022.repository.msg.ErrorAction3.mmObject();
			isDerived = false;
			xmlTag = "ActnToPrc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionToProcess";
			definition = "Action to be processed for the related errors.";
			nextVersions_lazy = () -> Arrays.asList(ErrorAction4.mmActionToProcess);
			previousVersion_lazy = () -> ErrorAction2.mmActionToProcess;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementErrorAction2Code.mmObject();
		}

		@Override
		public TerminalManagementErrorAction2Code getValue(ErrorAction3 obj) {
			return obj.getActionToProcess();
		}

		@Override
		public void setValue(ErrorAction3 obj, TerminalManagementErrorAction2Code value) {
			obj.setActionToProcess(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ErrorAction3.mmActionResult, com.tools20022.repository.msg.ErrorAction3.mmActionToProcess);
				trace_lazy = () -> TerminalManagementAction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ErrorAction3";
				definition = "Action to perform in case of error on the related action in progress.";
				nextVersions_lazy = () -> Arrays.asList(ErrorAction4.mmObject());
				previousVersion_lazy = () -> ErrorAction2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<TerminalManagementActionResult3Code> getActionResult() {
		return actionResult == null ? actionResult = new ArrayList<>() : actionResult;
	}

	public ErrorAction3 setActionResult(List<TerminalManagementActionResult3Code> actionResult) {
		this.actionResult = Objects.requireNonNull(actionResult);
		return this;
	}

	public TerminalManagementErrorAction2Code getActionToProcess() {
		return actionToProcess;
	}

	public ErrorAction3 setActionToProcess(TerminalManagementErrorAction2Code actionToProcess) {
		this.actionToProcess = Objects.requireNonNull(actionToProcess);
		return this;
	}
}